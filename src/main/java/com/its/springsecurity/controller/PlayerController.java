package com.its.springsecurity.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.its.springsecurity.dto.PlayerDTO;
import com.its.springsecurity.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;






    @GetMapping("/player")
    public String player(Model model) throws IOException{

        File file = new File("D:\\springboot_img\\선수2.txt");

        String jsonString = new String(Files.readAllBytes(file.toPath()));
        ObjectMapper objectMapper = new ObjectMapper();
        List<PlayerDTO> playerList = objectMapper.readValue(jsonString, new TypeReference<>() {
        });


        model.addAttribute("playerList", playerList);

        return "FootballPlayer";
    }

    @PostMapping("/api/players")
    public String playerSave(@RequestBody PlayerDTO playerDTO){
        playerService.save(playerDTO);
        return "FootballPlayer";
    }





}
