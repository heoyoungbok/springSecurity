package com.its.springsecurity.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CrawlingService  {


    public String craw()throws IOException {
        String url = "https://www.zentoto.com/sports/soccer/epl";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.getElementsByAttributeValue("class","standing-team");
        Element element = elements.get(0);
        Elements contents = element.select("tbody");
        Elements imgElements = contents.select("td img"); // 사진
//        Elements tbElement = element.getElementsByAttributeValue("class","td_name");
        Elements nameElements = contents.select("tr a"); // 팀 이름
        Elements tdElements = contents.select("tr td"); //
        System.out.println(tdElements.size());
        for (int i = 0; i < tdElements.size(); i++) {
            Element result = tdElements.get(i);
            System.out.println(result);
//            elements.attr("td");
            System.out.println("################################################");





        }

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

        return url;
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

