package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity;
import lombok.*;

@Data
@Getter
@Setter
@ToString
public class CrawlingDTO {
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


//    public CrawlingDTO() {
//
//    }


    public static CrawlingDTO coDTO(CrawlingEntity crawlingEntity){
    CrawlingDTO crawlingDTO = new CrawlingDTO();
    crawlingDTO.setId(crawlingEntity.getId());
    crawlingDTO.setName(crawlingEntity.getName());
    crawlingDTO.setTeam(crawlingEntity.getTeam());
    crawlingDTO.setWin(crawlingEntity.getWin());
    crawlingDTO.setLose(crawlingEntity.getLose());
    crawlingDTO.setDraw(crawlingEntity.getDraw());
    crawlingDTO.setGames(crawlingEntity.getGames());
    crawlingDTO.setPoint(crawlingEntity.getPoint());
    crawlingDTO.setPlus(crawlingEntity.getPlus());
    crawlingDTO.setMinus(crawlingEntity.getMinus());
    crawlingDTO.setDiff(crawlingEntity.getDiff());
//    crawlingDTO.setRanking(crawlingEntity.getRanking());

    return crawlingDTO;



    }


}
