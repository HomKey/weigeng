package com.wg.controller;

import com.wg.entity.EventInfo;
import com.wg.service.IEventInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@RestController
@RequestMapping("/weigeng")
public class WgController {

    @Autowired
    private IEventInfoService eventInfoService;

    @GetMapping("/list")
    public ResponseResult findAllByPage(
            @RequestParam(value = "page", defaultValue = "1", required = false) Integer page,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize);
        Page<EventInfo> lotteryInfoList = eventInfoService.findAllByPage(pageRequest);
        return new ResponseResult(ResponseEnum.SUCCESS, lotteryInfoList);
    }
}
