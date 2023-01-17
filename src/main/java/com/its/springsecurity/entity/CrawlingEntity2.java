package com.its.springsecurity.entity;

import com.its.springsecurity.dto.Crawling2DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "craw2_table")
public class CrawlingEntity2 {
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

    public static CrawlingEntity2 toSaveEntity(Crawling2DTO crawling2DTO) {
        CrawlingEntity2 crawlingEntity2 = new CrawlingEntity2();
        crawlingEntity2.setName(crawling2DTO.getName());
        crawlingEntity2.setGames(crawling2DTO.getGames());
        crawlingEntity2.setTeam(crawling2DTO.getTeam());
        crawlingEntity2.setWin(crawling2DTO.getWin());
        crawlingEntity2.setLose(crawling2DTO.getLose());
        crawlingEntity2.setDraw(crawling2DTO.getDraw());
        crawlingEntity2.setPoint(crawling2DTO.getPoint());
        crawlingEntity2.setPlus(crawling2DTO.getPlus());
        crawlingEntity2.setMinus(crawling2DTO.getMinus());
        crawlingEntity2.setDiff(crawling2DTO.getDiff());
//    crawlingEntity.setRanking(crawlingDTO.getRanking());
//    crawlingEntity.setContents(crawlingDTO.getContents());
//    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
//    crawlingEntity.setImageUrl(crawlingDTO.getImageUrl());
        return crawlingEntity2;


    }

}
