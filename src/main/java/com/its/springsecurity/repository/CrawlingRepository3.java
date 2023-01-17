package com.its.springsecurity.repository;

import com.its.springsecurity.entity.CrawlingEntity3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepository3 extends JpaRepository<CrawlingEntity3,Long> {

}
