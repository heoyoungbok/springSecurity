package com.its.springsecurity.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.its.springsecurity.dto.PlayerDTO;
import com.its.springsecurity.repository.PlayerRepository;
import com.its.springsecurity.service.PlayerService;
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
    private final PlayerRepository playerRepository;





    @GetMapping("/player")
    public String player(Model model) throws IOException{

        File file = new File("D:\\springboot_img\\선수2.txt");

        String jsonString = new String(Files.readAllBytes(file.toPath()));
        ObjectMapper objectMapper = new ObjectMapper();
        List<PlayerDTO> playerList = objectMapper.readValue(jsonString, new TypeReference<>() {
        });

//        for (PlayerDTO player : playerList) {
//            player.setImageUrl("file:///D:/footballplayer/p" + player.getId() + ".png");
//        }



        // Add the list of PlayerDTO objects to the model and pass it to the view template
        model.addAttribute("playerList", playerList);
//        List<String> imageUrls = new ArrayList<>();
//        for (int i = 0; i < playerList.size(); i++) {
//            PlayerDTO player = playerList.get(i);
//            String imageUrl = img.get(i).attr("src");
//            imageUrls.add(imageUrl);
//        }
//
//        model.addAttribute("imageUrls",imageUrls);
        return "FootballPlayer";
    }

//    @GetMapping("/player2")
//    public String player2(Model model) throws IOException{
//
//        File file = new File("D:\\springboot_img\\선수2.txt");
//
//        String jsonString = new String(Files.readAllBytes(file.toPath()));
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<PlayerDTO> playerList = objectMapper.readValue(jsonString, new TypeReference<>() {
//        });
//
////        for (PlayerDTO player : playerList) {
////            player.setImageUrl("file:///D:/footballplayer/p" + player.getId() + ".png");
////        }
//
//
//
//        // Add the list of PlayerDTO objects to the model and pass it to the view template
//        model.addAttribute("playerList", playerList);
////        List<String> imageUrls = new ArrayList<>();
////        for (int i = 0; i < playerList.size(); i++) {
////            PlayerDTO player = playerList.get(i);
////            String imageUrl = img.get(i).attr("src");
////            imageUrls.add(imageUrl);
////        }
////
////        model.addAttribute("imageUrls",imageUrls);
//        return "FootballPlayer2";
//    }







}
