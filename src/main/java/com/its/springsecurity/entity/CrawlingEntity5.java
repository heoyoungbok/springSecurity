package com.its.springsecurity.entity;


import com.its.springsecurity.dto.Crawling5DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "craw5_table")
public class CrawlingEntity5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String games;
//    @Column
//    private String image;

    @Column
    private String team;

    @Column
    private String name;

    @Column
    private String lose;

    @Column
    private String win;

    @Column
    private String draw;

    @Column
    private int fileAttached;

    @Column
    private String point;

    @Column
    private String round;
    @Column
    private String plus;

    @Column
    private String minus;

    @Column
    private String diff;

    public static CrawlingEntity5 toSaveEntity(Crawling5DTO crawling5DTO) {
        CrawlingEntity5 crawlingEntity5 = new CrawlingEntity5();
        crawlingEntity5.setName(crawling5DTO.getName());
        crawlingEntity5.setGames(crawling5DTO.getGames());
        crawlingEntity5.setTeam(crawling5DTO.getTeam());
        crawlingEntity5.setWin(crawling5DTO.getWin());
        crawlingEntity5.setLose(crawling5DTO.getLose());
        crawlingEntity5.setDraw(crawling5DTO.getDraw());
        crawlingEntity5.setPoint(crawling5DTO.getPoint());
        crawlingEntity5.setPlus(crawling5DTO.getPlus());
        crawlingEntity5.setMinus(crawling5DTO.getMinus());
        crawlingEntity5.setDiff(crawling5DTO.getDiff());
//    crawlingEntity.setRanking(crawlingDTO.getRanking());
//    crawlingEntity.setContents(crawlingDTO.getContents());
//    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
//    crawlingEntity.setImageUrl(crawlingDTO.getImageUrl());
        return crawlingEntity5;


    }




}
