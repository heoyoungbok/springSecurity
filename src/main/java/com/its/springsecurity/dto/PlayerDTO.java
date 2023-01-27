package com.its.springsecurity.dto;

import com.its.springsecurity.entity.PlayerEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class PlayerDTO {

    private Long id;

    private String name;

    private String position;

    private String imageUrl;

    private String title;



    public static PlayerDTO plDTO(PlayerEntity playerEntity) {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setId(playerEntity.getId());
        playerDTO.setName(playerEntity.getName());
        playerDTO.setPosition(playerEntity.getPosition());
        playerDTO.setImageUrl(playerEntity.getImageUrl());
        playerDTO.setTitle(playerEntity.getTitle());


        return playerDTO;
    }

}

