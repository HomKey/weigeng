package com.wg.service;

import com.wg.entity.EventInfo;
import com.wg.repository.EventInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EventInfoService implements IEventInfoService {
    @Autowired
    private EventInfoRepository eventInfoRepository;

    @Override
    public void save(EventInfo eventInfo) {
        eventInfoRepository.save(eventInfo);
    }

    @Override
    public Page<EventInfo> findAllByPage(Pageable pageable) {
        return eventInfoRepository.findAll(pageable);
    }
}
