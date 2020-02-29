package com.wg.service;

import com.wg.entity.EventInfo;
import com.wg.repository.EventInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EventInfoService implements IEventInfoService{
    @Autowired
    private EventInfoRepository eventInfoRepository;

    @Override
    public void save(EventInfo eventInfo) {
        eventInfoRepository.save(eventInfo);
    }
}
