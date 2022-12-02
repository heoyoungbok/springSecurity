package com.its.springsecurity.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Controller;

import javax.lang.model.util.Elements;
import java.io.IOException;

@Controller
public class CrawlingController {

    private static String FootBall_URL = "https://sports.news.naver.com/wfootball/record/index";


    public void getFootBallData() throws IOException {
        Document doc = Jsoup.connect(FootBall_URL).get();
        Elements contents = (Elements) doc.select("ui table td tr");

        for (Element content : contents){
            Elements tdContents = (Elements) content.select("td");





        }

    }
        try{
            String connUrl =

//            Connection conn = Jsoup.connect(connUrl).header("Content-Type", "text/html; charset=UTF-8")
//                    .userAgent(USER_AGENT)
//                    .method(Connection.Method.GET)
//                    .ignoreContentType(true);



        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
