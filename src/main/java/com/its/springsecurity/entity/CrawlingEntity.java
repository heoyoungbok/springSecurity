package com.its.springsecurity.entity;

import com.its.springsecurity.dto.CrawlingDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "craw_table")
public class CrawlingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    @Column
    private String image;

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
    private String url;

    public static CrawlingEntity toSaveEntity(CrawlingDTO crawlingDTO){

    CrawlingEntity crawlingEntity = new CrawlingEntity();
    crawlingEntity.setName(crawlingDTO.getName());
    crawlingEntity.setImage(crawlingDTO.getImage());
    crawlingEntity.setTeam(crawlingDTO.getTeam());
    crawlingEntity.setWin(crawlingDTO.getWin());
    crawlingEntity.setLose(crawlingDTO.getLose());
    crawlingEntity.setDraw(crawlingDTO.getDraw());
    crawlingEntity.setUrl(crawlingDTO.getUrl());
    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
    return  crawlingEntity;



    }

}
