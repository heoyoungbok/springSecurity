package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity5;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Crawling5DTO {
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
    public static Crawling5DTO coDTO5(CrawlingEntity5 crawlingEntity5) {
        Crawling5DTO crawling5DTO = new Crawling5DTO();
        crawling5DTO.setId(crawlingEntity5.getId());
        crawling5DTO.setName(crawlingEntity5.getName());
        crawling5DTO.setTeam(crawlingEntity5.getTeam());
        crawling5DTO.setWin(crawlingEntity5.getWin());
        crawling5DTO.setLose(crawlingEntity5.getLose());
        crawling5DTO.setDraw(crawlingEntity5.getDraw());
        crawling5DTO.setGames(crawlingEntity5.getGames());
        crawling5DTO.setPoint(crawlingEntity5.getPoint());
        crawling5DTO.setPlus(crawlingEntity5.getPlus());
        crawling5DTO.setMinus(crawlingEntity5.getMinus());
        crawling5DTO.setDiff(crawlingEntity5.getDiff());
//    crawlingDTO.setRanking(crawlingEntity.getRanking());

        return crawling5DTO;

    }
}
