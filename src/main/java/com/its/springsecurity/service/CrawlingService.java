package com.its.springsecurity.service;

import com.its.springsecurity.dto.CrawlingDTO;
import com.its.springsecurity.entity.CrawlingEntity;
import com.its.springsecurity.repository.CrawlingRepository;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CrawlingService  {

    private final CrawlingRepository crawlingRepository;
    public Long craw(CrawlingDTO crawlingDTO)throws IOException {
        String url = "https://www.zentoto.com/sports/soccer/epl"; // 사설
        Document document = Jsoup.connect(url).get();
        Elements elements = document.getElementsByAttributeValue("class","standing-team");
        Element element = elements.get(0);
        Elements contents = element.select("tbody");
        Elements imgElements = contents.select("td img"); // 사진

        Elements nameElements = contents.select("tr td a"); // 팀 이름
        Elements tdElements = contents.select("tr td"); //
        Elements spanElements = contents.select("tr td span");       // 승리
//        System.out.println(tdElements.size());
//        String name = nameElements.text(); // 팀이름 추출
//        System.out.println(name);
        for (int i =0; i< nameElements.size();i++){
          Element result = nameElements.get(i);
            System.out.println(result);
        }


        String u = "https://www.goal.com/kr/%ED%94%84%EB%A6%AC%EB%AF%B8%EC%96%B4%EB%A6%AC%EA%B7%B8/%EC%88%9C%EC%9C%84/2kwbbcootiqqgmrzs6o5inle5"; // 골스튜디오
        Document doc = Jsoup.connect(u).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");
        Element ele= elem.get(0);
        Elements cons = ele.select("table");
        Elements img = cons.select("td img"); // 사진

        Elements names = cons.select("tbody tr"); // 팀 이름
        Elements tNames = names.select("tr ");
        Elements r = tNames.select("td");
////        String rank = r.text();
//        System.out.println(r);
//        String names1 =names.text();
//
//        for (int i =0; i<r.size(); i++){
//            Element result = r.get(i);
//            System.out.println("##############################");
//
//
//        }



//        String name1 = tNames.text(); // 팀이름 추출
//        System.out.println(names);
//        System.out.println(names1);
//        List<Elements> crawlingDTOList = new ArrayList<>();
////        crawlingDTOList.add(names);

//        CrawlingDTO crawlingDTO1 = new CrawlingDTO();
//        crawlingDTO1.setUrl(names1);
//        CrawlingEntity crawlingEntity = new CrawlingEntity();
//        crawlingEntity.setUrl(crawlingDTO.getUrl());
//
//        System.out.println(crawlingEntity);

//        for (int i = 0; i < names.size(); i++){
//            Element result = tdElements.get(i);
//
//            crawlingDTOList.add(result);
////            System.out.print(result);
//            CrawlingEntity crawlingEntity = CrawlingEntity.toSaveEntity(crawlingDTO);
//            Long save = crawlingRepository.save(crawlingEntity).getId();
//            CrawlingEntity entity = crawlingRepository.findById(save).get();
//            for ()
//
//
//
//
//
//
//        System.out.println(crawlingDTO1);
//
////
////
//
////        names1 = crawlingDTO.getUrl();
//
//        CrawlingEntity crawlingEntity = CrawlingEntity.toSaveEntity(crawlingDTO1);
//      crawlingRepository.save(crawlingEntity);
//

//
//        CrawlingDTO crawlingDTO = new CrawlingDTO();
//        crawlingDTO.setRound(String.valueOf(tNames));
//        List<> = crawlingRepository.save(crawlingDTO);


//        for (int i = 0; i < nameElements.size(); i++) {
////            Element result = tdElements.get(i);
//            final String result = nameElements.get(i).text();
//            System.out.println(result);

//            elements.attr("td");
//            System.out.println("################################################");

//
//
//        }
//
//        CrawlingEntity crawlingEntity = CrawlingEntity.toSaveEntity(crawlingDTO);
//        List<CrawlingDTO> crawlingDTOList = crawlingRepository.save(crawlingEntity).getId();
//
//
//        result.select("abbr");
//




//        System.out.println(trElements);
//        String tdElements = trElements.select("class widget-match-standings__team--full-name").text();
//        Elements nameElements = tdElements.select("div inner");
//        Elements tElements = nameElements.select("");
//        System.out.println(tdElements);
//        Elements pElements = contents.select("");
//        System.out.println(tElements);
//
//
//        }
//        String nUrl = "https://www.zentoto.com/sports/soccer/epl";
//        Document doc = Jsoup.connect(nUrl).get();
//        Elements ele = doc.getElementsByAttributeValue("class","standing-team");
//        Element e = ele.get(0);
//        Elements cons = e.select("tbody");
//        Elements img = e.select("td img");
//        Elements tr = cons.select("tr a");


//        System.out.println(img.size());



//                Element rank_el = rank.get(i);
//        System.out.println(contents.size());

//        System.out.println(element);


//        System.out.println(tbElement);
//        System.out.println(tbElement);
//        System.out.println(elements.size());
//        System.out.println(element);
//        Elements cElements = document.getElementsByAttributeValue("class","record_tbl");
//        System.out.println(cElements);
////        Elements imgElements = element.select("img");
////        Elements emblemElements = element.select("emblem");
//        System.out.println(emblemElements);
//        System.out.println(imgElements);

//        Elements contents = document.select("div.leagueRank sortPanel");
//        System.out.println("document = " + document);
//        for (Element content : contents){
//            CrawlingDTO crawlingDTO = CrawlingDTO.builder()
////                    .image(content.select("img").attr())
//                    .subject(content.select("div.td rank").text())
//                            .build();
//            CrawlingList.add(crawlingDTO);

//       return ;

//        return CrawlingDTO.coDTO();
        return null;
    }

    public List<CrawlingDTO> findAll() {
        List<CrawlingEntity> crawlingEntityList = crawlingRepository.findAll();
        List<CrawlingDTO> crawlingDTOList = new ArrayList<>();

        for (CrawlingEntity crawlingEntity : crawlingEntityList){
            crawlingDTOList.add(CrawlingDTO.coDTO(crawlingEntity));
        }
        return crawlingDTOList;
    }


//        return CrawlingList;
//        try {
//            document = Jsoup.connect(url).get();

//            for (int i = 0; i < rank.size(); i++) {
//                Element rank_el = rank.get(i);
//
//            }
//        }
    }
//    @PostConstruct
//    public List<CrawlingDTO> craw()throws IOException{
//        List<CrawlingDTO> CrawlingList = new ArrayList<>();
//
////            Document document = Jsoup.connect(url).get();
//
//            Elements elements = document.select("div.league_tables");
//            elements.forEach(System.out::println);
//
//
////        for (Element content : contents){
////            CrawlingDTO crawlingDTO = CrawlingDTO.builder()
//////                    .image(content.select("div img").attr("abs:src")) // 이미지
////                    .subject(content.select("div.th").text())      // 제목
//////                    .url(content.select("a").attr("abs:href")) // 링크
////                    .build();
////            CrawlingList.add(crawlingDTO);
////        }
////        return CrawlingList;
////            }
//        return null;
//    }

