package com.its.springsecurity.entity;

import com.its.springsecurity.dto.Crawling6DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "craw6_table")
public class CrawlingEntity6 {
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


    public static CrawlingEntity6 toSaveEntity(Crawling6DTO crawling6DTO) {
        CrawlingEntity6 crawlingEntity6 = new CrawlingEntity6();
        crawlingEntity6.setName(crawling6DTO.getName());
        crawlingEntity6.setGames(crawling6DTO.getGames());
        crawlingEntity6.setTeam(crawling6DTO.getTeam());
        crawlingEntity6.setWin(crawling6DTO.getWin());
        crawlingEntity6.setLose(crawling6DTO.getLose());
        crawlingEntity6.setDraw(crawling6DTO.getDraw());
        crawlingEntity6.setPoint(crawling6DTO.getPoint());
        crawlingEntity6.setPlus(crawling6DTO.getPlus());
        crawlingEntity6.setMinus(crawling6DTO.getMinus());
        crawlingEntity6.setDiff(crawling6DTO.getDiff());
//    crawlingEntity.setRanking(crawlingDTO.getRanking());
//    crawlingEntity.setContents(crawlingDTO.getContents());
//    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
//    crawlingEntity.setImageUrl(crawlingDTO.getImageUrl());
        return crawlingEntity6;


    }


}
