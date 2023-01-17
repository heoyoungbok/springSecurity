package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity4;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Crawling4DTO {
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


    public static Crawling4DTO coDTO4(CrawlingEntity4 crawlingEntity4) {
        Crawling4DTO crawling4DTO = new Crawling4DTO();
        crawling4DTO.setId(crawlingEntity4.getId());
        crawling4DTO.setName(crawlingEntity4.getName());
        crawling4DTO.setTeam(crawlingEntity4.getTeam());
        crawling4DTO.setWin(crawlingEntity4.getWin());
        crawling4DTO.setLose(crawlingEntity4.getLose());
        crawling4DTO.setDraw(crawlingEntity4.getDraw());
        crawling4DTO.setGames(crawlingEntity4.getGames());
        crawling4DTO.setPoint(crawlingEntity4.getPoint());
        crawling4DTO.setPlus(crawlingEntity4.getPlus());
        crawling4DTO.setMinus(crawlingEntity4.getMinus());
        crawling4DTO.setDiff(crawlingEntity4.getDiff());
//    crawlingDTO.setRanking(crawlingEntity.getRanking());

        return crawling4DTO;

    }


}
