package com.its.springsecurity.entity;

import com.its.springsecurity.dto.Crawling4DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "craw4_table")
public class CrawlingEntity4 {

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


    public static CrawlingEntity4 toSaveEntity(Crawling4DTO crawling4DTO) {
        CrawlingEntity4 crawlingEntity4 = new CrawlingEntity4();
        crawlingEntity4.setName(crawling4DTO.getName());
        crawlingEntity4.setGames(crawling4DTO.getGames());
        crawlingEntity4.setTeam(crawling4DTO.getTeam());
        crawlingEntity4.setWin(crawling4DTO.getWin());
        crawlingEntity4.setLose(crawling4DTO.getLose());
        crawlingEntity4.setDraw(crawling4DTO.getDraw());
        crawlingEntity4.setPoint(crawling4DTO.getPoint());
        crawlingEntity4.setPlus(crawling4DTO.getPlus());
        crawlingEntity4.setMinus(crawling4DTO.getMinus());
        crawlingEntity4.setDiff(crawling4DTO.getDiff());
//    crawlingEntity.setRanking(crawlingDTO.getRanking());
//    crawlingEntity.setContents(crawlingDTO.getContents());
//    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
//    crawlingEntity.setImageUrl(crawlingDTO.getImageUrl());
        return crawlingEntity4;


    }


}
