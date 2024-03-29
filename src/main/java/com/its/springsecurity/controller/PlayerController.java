package com.its.springsecurity.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.its.springsecurity.dto.PlayerDTO;
import com.its.springsecurity.service.PlayerService;
import com.its.springsecurity.service.SquadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    private final SquadService squadService;






    @GetMapping("/player")
    public String player(Model model) throws IOException{

        File file = new File("D:\\springboot_img\\선수2.txt");

        String jsonString = new String(Files.readAllBytes(file.toPath()));
        ObjectMapper objectMapper = new ObjectMapper();
        List<PlayerDTO> playerList = objectMapper.readValue(jsonString, new TypeReference<>() {
        });


        model.addAttribute("playerList", playerList);

        return "SquadMake/FootballPlayer";
    }



    @GetMapping("/allStar")
    public String allStar(Model model){
        List<PlayerDTO> players = playerService.findAll();
        model.addAttribute("players",players);
        return "SquadMake/AllStar";
    }

    @GetMapping("/findAll")
    public String findAll (Model model){
     List<PlayerDTO> playerList = playerService.findAll();
        model.addAttribute("playerList",playerList);
        return "StarList";
    }


}
