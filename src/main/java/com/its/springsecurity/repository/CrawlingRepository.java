package com.its.springsecurity.repository;

import com.its.springsecurity.entity.CrawlingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrawlingRepository extends JpaRepository<CrawlingEntity,Long> {

    List<CrawlingEntity> findAll();

    CrawlingEntity findByTeam(String team);
}
