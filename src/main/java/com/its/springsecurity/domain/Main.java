package com.its.springsecurity.domain;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.its.springsecurity.dto.PlayerDTO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\springboot_img\\player.txt");
        String jsonString = new String(Files.readAllBytes(file.toPath()));

        // Use the ObjectMapper to parse the JSON string into a list of Player objects
        ObjectMapper objectMapper = new ObjectMapper();
        List<PlayerDTO> players = objectMapper.readValue(jsonString, new TypeReference<List<PlayerDTO>>() {
        });

        for (PlayerDTO playerDTO : players) {
            Long id = playerDTO.getId();
            String player = playerDTO.getName();

        }

    }



    }




