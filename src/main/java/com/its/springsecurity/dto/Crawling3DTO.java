package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity3;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Crawling3DTO {
    private Long id;
    //    private Integer ranking;
    private String games;
    private String name;

    private String team;

    private String lose;

    private String win;

    private String draw;
    private String point;

    private String round;

    private String plus;

    private String minus;

    private String diff;


    public static Crawling3DTO coDTO3(CrawlingEntity3 crawlingEntity3) {
        Crawling3DTO crawling3DTO = new Crawling3DTO();
        crawling3DTO.setId(crawlingEntity3.getId());
        crawling3DTO.setName(crawlingEntity3.getName());
        crawling3DTO.setTeam(crawlingEntity3.getTeam());
        crawling3DTO.setWin(crawlingEntity3.getWin());
        crawling3DTO.setLose(crawlingEntity3.getLose());
        crawling3DTO.setDraw(crawlingEntity3.getDraw());
        crawling3DTO.setGames(crawlingEntity3.getGames());
        crawling3DTO.setPoint(crawlingEntity3.getPoint());
        crawling3DTO.setPlus(crawlingEntity3.getPlus());
        crawling3DTO.setMinus(crawlingEntity3.getMinus());
        crawling3DTO.setDiff(crawlingEntity3.getDiff());
//    crawlingDTO.setRanking(crawlingEntity.getRanking());

        return crawling3DTO;

    }
}