package com.wg;

import com.wg.dto.WgDataDto;
import com.wg.entity.EventInfo;
import com.wg.net.udp.UdpServer;
import com.wg.service.IEventInfoService;
import com.wg.util.HexUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;

@Component
@Order(1)
public class WGServerApplication implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(WGServerApplication.class);

    @Autowired
    private IEventInfoService eventInfoService;

    @Override
    public void run(ApplicationArguments args) {
        start();
    }

    private void start() {
        Thread thread = new Thread(() -> {
            try {
                new UdpServer().listen(60000, responseData -> {
                    if (responseData == null) return;
                    String[] strings = HexUtil.toHexStringArray(responseData, false);
                    logger.info(Arrays.toString(strings));
                    if (responseData.length != 64) return;
                    WgDataDto wgDataDto = new WgDataDto(responseData);
                    logger.info(wgDataDto.toString());
                    EventInfo eventInfo = new EventInfo(wgDataDto);
                    eventInfoService.save(eventInfo);
                });
            } catch (IOException e) {
                try {
                    logger.error("通讯异常:1分钟后重新尝试");
                    Thread.sleep(60000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
                start();
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
