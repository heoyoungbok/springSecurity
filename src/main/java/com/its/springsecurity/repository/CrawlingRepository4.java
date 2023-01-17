package com.its.springsecurity.repository;

import com.its.springsecurity.entity.CrawlingEntity4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepository4 extends JpaRepository<CrawlingEntity4,Long> {
}
