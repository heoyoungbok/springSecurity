package com.its.springsecurity.repository;

import com.its.springsecurity.entity.CrawlingEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepository2 extends JpaRepository<CrawlingEntity2,Long> {

}
