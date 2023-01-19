package com.its.springsecurity.service;

import com.its.springsecurity.dto.PlayerDTO;
import com.its.springsecurity.entity.PlayerEntity;
import com.its.springsecurity.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlayerService {
        private final PlayerRepository playerRepository;
    public void player(PlayerDTO playerDTO) throws IOException {
        String playerURL = "https://static.api.nexon.co.kr/fifaonline4/latest/spid.json";
        Document document = Jsoup.connect(playerURL).get();
        Elements pre = document.getElementsByAttributeValue("pre","style");
        System.out.println(pre);


//        String elements = div.text();
//        System.out.println(elements);
//        String id = elements.select("id").text();
//        System.out.println(id);
//        String name = elements.select("name").text();
//        System.out.println(name);


//        Elements elements1 = document.getElementsByAttributeValue("class","fifa4 player_info clearfix");
//        Elements names = document.getElementsByAttributeValue("class","fifa4 name");
//        Elements div = document.getElementsByAttributeValue("class","fifa4 img_area");
//        Elements img = div.select("img");





////        Elements result = elements.select("br");
//
//        System.out.println(result);

////
//        for (int i = 0; i < img.size(); i++) {
//
//            String imageUrl = img.get(i).attr("abs:src");
//
//
//
//                                         // 이미지 웹크롤링
//
//
////            Element text = result.select(src.text()).get(i);
////            System.out.println(text);
//            Connection.Response response = Jsoup.connect(imageUrl)
//                    .ignoreContentType(true)
//                    .userAgent("MyJavaClient/1.0")
//                    .method(Connection.Method.GET)
//                    .execute();
//
//
//            try (InputStream inputStream = response.bodyStream();
//                 FileOutputStream fos = new FileOutputStream("D://springboot_img//file.png" + (i + 1) + ".png")) {
//
////            Connection.Response response =
////                    (Connection.Response) Jsoup.connect(imageUrl).ignoreContentType(true).execute();
//                byte[] buffer = new byte[1024];
//                int n;
//                while ((n = inputStream.read(buffer)) != -1) {
//                    fos.write(buffer, 0, n);
//                }
//
////            fos.write(imageData);
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//                continue;
//            }
////            Elements imageElements = document.select("img");
//        }


//            List<PlayerEntity> playerEntityList = new ArrayList<>();
//        for (int i = 0; i < img.size(); i++){
//            PlayerDTO pDTO =  new PlayerDTO();
//            pDTO.setPlayer(B.get(i).text());
////            pDTO.setImageUrl(img.get(i).attr("src"));
//            Optional<PlayerEntity> optionalEntity =  playerRepository.findByPlayer(pDTO.getPlayer());
//            if (optionalEntity.isPresent()) {
//                PlayerEntity existingEntity = optionalEntity.get();
//                existingEntity.setPlayer(pDTO.getPlayer());
////                existingEntity.setImageUrl(pDTO.getImageUrl());
//                playerRepository.save(existingEntity);
//            }else {
//                playerRepository.save(PlayerEntity.toSaveEntity(pDTO));
//            }
//
//        }


    }

    public List<PlayerDTO> findAll() {
        List<PlayerEntity> playerEntityList = playerRepository.findAll();
        List<PlayerDTO> playerDTOList = playerEntityList.stream()
                .map(PlayerDTO::plDTO)
                .collect(Collectors.toList());
        return playerDTOList;
    }

    public void save(PlayerDTO playerDTO) {
     playerRepository.save(PlayerEntity.toSaveEntity(playerDTO));

    }

//    public List<PlayerDTO> findUrls() {
//        List<PlayerEntity> playerEntityList = playerRepository.findAll();
//        List<PlayerDTO> playerDTOList = playerEntityList.stream()
//                .map(PlayerDTO::plDTO)
//                .collect(Collectors.toList());
//        return playerDTOList;
//    }

//    public List<String> findUrls() {
//        return playerRepository.findByUrlNotNull();
//    }
}
