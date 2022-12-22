package com.its.springsecurity.entity;

import com.its.springsecurity.dto.CrawlingDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Data
@Entity
@Getter
@Setter
@Table(name = "craw_table")
public class CrawlingEntity {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrawlingEntity that = (CrawlingEntity) o;
        return Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    @Column
    private Integer ranking;
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

    @Column
    private String round;

    @Column
    private String contents;

    public static CrawlingEntity toSaveEntity(CrawlingDTO crawlingDTO){
    CrawlingEntity crawlingEntity = new CrawlingEntity();
    crawlingEntity.setName(crawlingDTO.getName());
    crawlingEntity.setImage(crawlingDTO.getImage());
    crawlingEntity.setTeam(crawlingDTO.getTeam());
    crawlingEntity.setWin(crawlingDTO.getWin());
    crawlingEntity.setLose(crawlingDTO.getLose());
    crawlingEntity.setDraw(crawlingDTO.getDraw());
    crawlingEntity.setUrl(crawlingDTO.getUrl());
    crawlingEntity.setRanking(crawlingDTO.getRanking());
    crawlingEntity.setContents(crawlingDTO.getContents());
    crawlingEntity.setFileAttached(crawlingDTO.getFileAttached());
    return  crawlingEntity;



    }

}
