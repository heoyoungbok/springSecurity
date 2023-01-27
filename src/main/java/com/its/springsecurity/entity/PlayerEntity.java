package com.its.springsecurity.entity;

import com.its.springsecurity.dto.PlayerDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "player_table")
public class PlayerEntity {

    @Id
    @SequenceGenerator(name = "player_seq", sequenceName = "player_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_seq")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "position")
    private String position;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "title")
    private String title;



    public static PlayerEntity toSaveEntity(PlayerDTO playerDTO){
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setName(playerDTO.getName());
        playerEntity.setPosition(playerDTO.getPosition());
        playerEntity.setImageUrl(playerDTO.getImageUrl());
        playerEntity.setTitle(playerDTO.getTitle());


        return playerEntity;
    }


}
