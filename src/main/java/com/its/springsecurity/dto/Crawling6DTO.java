package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity6;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Crawling6DTO {
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
    public static Crawling6DTO coDTO6(CrawlingEntity6 crawlingEntity6) {
        Crawling6DTO crawling6DTO = new Crawling6DTO();
        crawling6DTO.setId(crawlingEntity6.getId());
        crawling6DTO.setName(crawlingEntity6.getName());
        crawling6DTO.setTeam(crawlingEntity6.getTeam());
        crawling6DTO.setWin(crawlingEntity6.getWin());
        crawling6DTO.setLose(crawlingEntity6.getLose());
        crawling6DTO.setDraw(crawlingEntity6.getDraw());
        crawling6DTO.setGames(crawlingEntity6.getGames());
        crawling6DTO.setPoint(crawlingEntity6.getPoint());
        crawling6DTO.setPlus(crawlingEntity6.getPlus());
        crawling6DTO.setMinus(crawlingEntity6.getMinus());
        crawling6DTO.setDiff(crawlingEntity6.getDiff());
//    crawlingDTO.setRanking(crawlingEntity.getRanking());

        return crawling6DTO;

    }


}
