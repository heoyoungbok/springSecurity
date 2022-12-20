package com.its.springsecurity.repository;

import com.its.springsecurity.entity.CrawlingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepository extends JpaRepository<CrawlingEntity,Long> {


}
