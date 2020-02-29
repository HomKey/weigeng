package com.wg.repository;

import com.wg.entity.EventInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventInfoRepository extends JpaRepository<EventInfo, Long> {
}
