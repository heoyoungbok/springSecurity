package com.its.springsecurity.entity;

import com.its.springsecurity.dto.Crawling3DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "craw3_table")
public class CrawlingEntity3 {
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

    public static CrawlingEntity3 toSaveEntity(Crawling3DTO crawling3DTO) {
        CrawlingEntity3 crawlingEntity3 = new CrawlingEntity3();
        crawlingEntity3.setName(crawling3DTO.getName());
        crawlingEntity3.setGames(crawling3DTO.getGames());
        crawlingEntity3.setTeam(crawling3DTO.getTeam());
        crawlingEntity3.setWin(crawling3DTO.getWin());
        crawlingEntity3.setLose(crawling3DTO.getLose());
        crawlingEntity3.setDraw(crawling3DTO.getDraw());
        crawlingEntity3.setPoint(crawling3DTO.getPoint());
        crawlingEntity3.setPlus(crawling3DTO.getPlus());
        crawlingEntity3.setMinus(crawling3DTO.getMinus());
        crawlingEntity3.setDiff(crawling3DTO.getDiff());
//    crawlingEntity.setRanking(crawlingDTO.getRanking());
//    crawlingEntity.setContents(crawlingDTO.getContents());
//    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
//    crawlingEntity.setImageUrl(crawlingDTO.getImageUrl());
        return crawlingEntity3;


    }
}