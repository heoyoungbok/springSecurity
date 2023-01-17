package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity2;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Crawling2DTO {
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

    public static Crawling2DTO coDTO2(CrawlingEntity2 crawlingEntity2) {
        Crawling2DTO crawling2DTO = new Crawling2DTO();
        crawling2DTO.setId(crawlingEntity2.getId());
        crawling2DTO.setName(crawlingEntity2.getName());
        crawling2DTO.setTeam(crawlingEntity2.getTeam());
        crawling2DTO.setWin(crawlingEntity2.getWin());
        crawling2DTO.setLose(crawlingEntity2.getLose());
        crawling2DTO.setDraw(crawlingEntity2.getDraw());
        crawling2DTO.setGames(crawlingEntity2.getGames());
        crawling2DTO.setPoint(crawlingEntity2.getPoint());
        crawling2DTO.setPlus(crawlingEntity2.getPlus());
        crawling2DTO.setMinus(crawlingEntity2.getMinus());
        crawling2DTO.setDiff(crawlingEntity2.getDiff());

        return crawling2DTO;

    }
}
