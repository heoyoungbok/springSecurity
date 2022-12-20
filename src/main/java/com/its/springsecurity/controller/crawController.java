package com.its.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class crawController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
//    @ResponseBody
//    @GetMapping("/craw")
//    public boolean crawForm()throws Exception{
//        String url = "https://sports.news.naver.com/wfootball/record/index";
//        // 순위 파싱
//        Elements showRanking  =
//        // 팀순위 파싱
//
//        // 순위 , 팀 . 경시수 , 승점 , 무 , 패, 득점 , 실점 , 득실차
//        Document doc = null;
//        doc = Jsoup.connect(url).get();
//        Elements es = doc.select("")

//        if ((req.getParameter("url"))==null){
//            return "home";
//        }
//        url = req.getParameter("url");

//        String url = "https://sports.news.naver.com/wfootball/record/index="+user_id;
//        Document doc = Jsoup.connect(url).get();
//        Elements ele = doc.select("#container #content");
//        ele.stream().forEach(name -> System.out.println("name.text() = " + name.text()));
    }


//    public static void main(String[] args) throws IOException {
//        Document document =Jsoup.connect("https://sports.news.naver.com/wfootball/record/index").get();
//        Elements titles =  document.select("div.content");
//        for (int i = 0 ; i<7; i++){
//            Element title = titles.get(i);
//            System.out.println("title = " + title);
//        }
//     String url ="";
//     org.jsoup.nodes.Document document = Jsoup.connect(url).get();
//     org.jsoup.select.Elements elements = document.select("div[id=\"content\"]");
//     for (org.jsoup.nodes.Element e : elements.select("table")){








    //            Connection conn = Jsoup.connect(connUrl).header("Content-Type", "text/html; charset=UTF-8")
//                    .userAgent(USER_AGENT)
//                    .method(Connection.Method.GET)
//                    .ignoreContentType(true);





