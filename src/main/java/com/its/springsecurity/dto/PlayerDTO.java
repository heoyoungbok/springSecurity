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



//    for ( : players) {
//        Long id = player.getId();
//        String name = player.getName();
//        // Do something with the id and name values
//    }

//    ObjectMapper objectMapper = new ObjectMapper();
//
//    // Parse the JSON string into a list of Player objects
//    List<PlayerDTO> playerList = objectMapper.readValue(jsonString, new TypeReference<List<PlayerDTO>>(){});
//
//// Iterate through the list of players and extract the id and name values
//for (PlayerDTO playerDTO : playerList) {
//        Long id = playerDTO.getId();
//        String name = playerDTO.getPlayer();
//        // Do something with the id and name values
//    }




//    private String imageUrl;

//    public void PlayerWithImage(PlayerDTO player, String imageUrl) {
//
//    }

    public static PlayerDTO plDTO(PlayerEntity playerEntity){
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setId(playerEntity.getId());
        playerDTO.setName(playerEntity.getName());
        playerDTO.setPosition(playerEntity.getPosition());
        playerDTO.setImageUrl(playerEntity.getImageUrl());
        playerDTO.setTitle(playerEntity.getTitle());



        return playerDTO;
    }

    public static PlayerEntity toSaveEntity(PlayerDTO playerDTO) {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setName(playerDTO.getName());
        playerEntity.setPosition(playerDTO.getPosition());
        playerEntity.setImageUrl(playerDTO.getImageUrl());
        playerEntity.setTitle(playerDTO.getTitle());
        return playerEntity;
    }
}
