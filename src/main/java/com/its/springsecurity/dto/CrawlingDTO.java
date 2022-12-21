package com.its.springsecurity.dto;

import com.its.springsecurity.entity.CrawlingEntity;
import lombok.*;

@Data
@Getter
@Setter
@ToString
public class CrawlingDTO {
    private Long id;
    private Integer ranking;
    private String image;
    private String name;

    private String team;

    private String lose;

    private String win;

    private String draw;
    private String url;

    private String round;

    private int fileAttached;

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
    crawlingDTO.setImage(crawlingEntity.getImage());
    crawlingDTO.setUrl(crawlingEntity.getUrl());
    crawlingDTO.setRanking(crawlingEntity.getRanking());
    crawlingDTO.setFileAttached(crawlingEntity.getFileAttached());

    return crawlingDTO;



    }


}
