package com.wg;

import com.wg.dto.WgDataDto;
import com.wg.entity.EventInfo;
import com.wg.net.udp.IUdpResponseHandle;
import com.wg.net.udp.UdpServer;
import com.wg.service.EventInfoService;
import com.wg.service.IEventInfoService;
import com.wg.util.HexUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class WGServerApplication implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(WGServerApplication.class);

    @Autowired
    private IEventInfoService eventInfoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        new UdpServer().listen(60000, new IUdpResponseHandle() {
            @Override
            public void handle(byte[] responseData) {
                WgDataDto wgDataDto = new WgDataDto(responseData);
                EventInfo eventInfo = new EventInfo(wgDataDto);
                eventInfoService.save(eventInfo);
                String[] strings = HexUtil.toHexStringArray(responseData, false);
                logger.info(Arrays.toString(strings));
            }
        });
    }
}
