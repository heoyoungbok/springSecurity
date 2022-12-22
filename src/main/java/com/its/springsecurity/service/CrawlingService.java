package com.its.springsecurity.service;

import com.its.springsecurity.config.WebConfig;
import com.its.springsecurity.dto.CrawlingDTO;
import com.its.springsecurity.entity.CrawlingEntity;
import com.its.springsecurity.repository.CrawlingRepository;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
@RequiredArgsConstructor
public class CrawlingService {
    private final WebConfig webConfig;
    private final CrawlingRepository crawlingRepository;

    public void craw(CrawlingDTO crawlingDTO) throws IOException {
//        String url = "https://www.zentoto.com/sports/soccer/epl"; // 사설
//        Document document = Jsoup.connect(url).get();
//        Elements elements = document.getElementsByAttributeValue("class", "standing-team");
//        Element element = elements.get(0);
//        Elements contents = element.select("tbody");
//        Elements imgElements = contents.select("td img"); // 사진
//
//        Elements nameElements = contents.select("tr td a"); // 팀 이름
//        Elements tdElements = contents.select("tr td"); //
//        Elements spanElements = contents.select("tr td span");       // 승리
////        System.out.println(tdElements.size());
////        String name = nameElements.text(); // 팀이름 추출
////        System.out.println(name);
//        for (int i = 0; i < nameElements.size(); i++) {
//            Element result = nameElements.get(i);
//            String name = result.text();
////            System.out.println(name);
//        }

//
//        String url = "https://sports.news.naver.com/wfootball/record/index"; // 피파
//        Document document = Jsoup.connect(url).get();
//        Elements elements = document.getElementsByAttributeValue("id","content");
////        Element element = elements.get(0);
//
//        Elements contents = elements.select("record_tbl table");
//        System.out.println(contents.size());
////        Elements imgElements = contents.select("td img"); // 사진
//
//        Elements tElements = contents.select("league_tables_content"); // 팀 이름
//        Elements teamsElements = tElements.select("name");
//        Elements tdElements = contents.select("tr td"); //
//        Elements spanElements = contents.select("tr td span");       // 승리
//        System.out.println(tdElements.size());
//        String name = nameElements.text(); // 팀이름 추출
//        System.out.println(name);
//        for (int i =0; i< nameElements.size();i++){
//          Element result = nameElements.get(i);
//            System.out.println(result);
//        }



        String u = "https://www.goal.com/kr/%ED%94%84%EB%A6%AC%EB%AF%B8%EC%96%B4%EB%A6%AC%EA%B7%B8/%EC%88%9C%EC%9C%84/2kwbbcootiqqgmrzs6o5inle5"; // 골스튜디오



        Document doc = Jsoup.connect(u).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");

        Element ele = elem.get(0);
        Elements cons = ele.select("table");
        Elements img = cons.select("td a img"); // 사진
        System.out.println(img);
        Elements src = img.select("src");
        Elements names = cons.select("tbody tr"); // 팀 이름
        Elements tNames = names.select("tr ");
        Elements td = tNames.select("td");
        Elements team = td.select("span");
//            Elements tdD = td.select("widget-match-standings__matches-played");
//            System.out.println(tdD.size());
        Elements elements1 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-played");
        Elements games = elements1.select("td");
//        System.out.println(games);
        Elements elements2 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-won");
        Elements wins = elements2.select("td");
//        System.out.println(wins);

        Elements elements3 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-drawn");
        Elements draws = elements3.select("td");

        Elements elements4 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-lost");
        Elements lost = elements4.select("td");

        Elements elements5 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-diff");
        Elements diff = elements5.select("td");

        Elements elements6 = doc.getElementsByAttributeValue("class", "widget-match-standings__pts");
        Elements points = elements6.select("td");


        Set<CrawlingEntity> uniqueContents = new HashSet<>();    // td에 대한 전체 포문
        CrawlingDTO crawlingDTO1 = new CrawlingDTO();
        CrawlingEntity entity = new CrawlingEntity();
        for (int i = 0; i < tNames.size(); i++) {
            Element result;
            result = tNames.get(i);
            String result1 = result.text();
            crawlingDTO1.setTeam(result1);
            uniqueContents.add(entity);
            CrawlingEntity crawlingEntity = CrawlingEntity.toSaveEntity(crawlingDTO1);

            // 같은 이름이 중복될시 저장되는 건 미확인
            for (CrawlingEntity crawling : uniqueContents) {
                crawlingRepository.save(crawling);

//                String textResult = result.
//                System.out.println(result1);

            }


        }

        for (int i = 0; i < team.size(); i++) {   // 팀이름
            Element result = team.get(i);
            String textResult = result.text();
            System.out.println(textResult);
//            String result1 = result.text();
            crawlingDTO1.setTeam(textResult);
//            uniqueContents.add(entity);
//            CrawlingEntity crawlingEntity = CrawlingEntity.toSaveEntity(crawlingDTO1);
//            crawlingRepository.save(crawlingEntity);
//
        }


        for (int i = 0; i < games.size(); i++) {  //게임수
            Element result = games.get(i);
            String textResult = result.text();


        }

        for (int i = 0; i < wins.size(); i++) {  // 승리한 경기
            Element result = wins.get(i);
            String textResult = result.text();
        }

        for (int i = 0; i < draws.size(); i++) {
            Element result = draws.get(i);
            String textResult = result.text();
        }

        for (int i = 0; i < lost.size(); i++) {
            Element result = lost.get(i);
            String textResult = result.text();
        }

        for (int i = 0; i < diff.size(); i++) {
            Element result = diff.get(i);
            String textResult = result.text();
        }

        for (int i = 0; i < points.size(); i++) {
            Element result = points.get(i);
            String textResult = result.text();
        }

        for (int i = 0; i < src.size(); i++) {
            Element result = src.get(i);
            System.out.println(result);
//            // src 속성 값에서 파일 이름을 잘라냄
//            String url = result.attr("src");
//            String[] splitUrl = result.attr("src").split("/");
//            String fileName = splitUrl[splitUrl.length-1];
//            // 파일 다운로드
//
//            this.saveAttach(url,fileName,sessinId);
//            // img 태그의 src 속성을 다운로드한 파일로 수정
//
//            result.attr("src",fileName);
        }
//
//        String nUrl = "https://sports.news.naver.com/wfootball/record/index?category=epl&year=2022&tab=team";
//        Document document = Jsoup.connect(nUrl).get();
//        Elements elements = document.getElementsByAttributeValue("class","record_tbl");
//        Elements elem1 = elements.select("table tbody");
//        Elements TR = elem1.select("tr td");
//        Elements elem2 = document.getElementsByAttributeValue("class","inner");
//        Elements bImg = elem2.select("img");
//        System.out.println(bImg);


//
//        String savePath = "file:///D:/springboot_img/";
//        File dir = new File(savePath);
//        if (!dir.exists()){
//            dir.mkdir();
//        }
//            Element result = img.get(i);
//        try {
//            doc = Jsoup.connect(u).get();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return;


        for (int i = 0; i < img.size(); i++) {
            Element result = img.get(i);

            System.out.println(result);




            String fileUrl = img.attr("src");
            URL url;

            try {
                url = new URL(fileUrl);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                continue;
            }
            HttpURLConnection connection;

            try {
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

            InputStream in;

            try {
                InputStream inputStream = connection.getInputStream();
                int contentLength = 0;
                byte[] buffer = new byte[1024];
                int n;


                FileOutputStream fos = new
                        FileOutputStream("D://springboot_img//file.png" + (i + 1) + ".png");
                while ((n = inputStream.read(buffer)) !=-1) {
                    contentLength += n;

//                    fos.write(buffer, 0, n); // 저장 쿼리
                }
                inputStream.close();
//                connection.setRequestProperty("Content-Length", "1024");
//                fos.close();
//                in.close();
//                connection.disconnect();
                connection.setRequestProperty("Content-Length",Integer.toString(contentLength));



            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }


        }


//            String imgResult = img.get(i).attr("src");


//            String fileUrl = img.attr("src");  // get the src attribute of the image element
//            URL url = new URL(fileUrl);  // create a URL object from the fileUrl
//
//
////
////
////
////            System.out.println(fileUrl);
////            System.out.println(img);
//// open a connection to the URL
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");  // set the request method to GET
//
//// get the input stream from the connection and read the file contents
//            InputStream in = connection.getInputStream();
//            byte[] buffer = new byte[4096];
//            int n;
//
//// create a file output stream to write the file to disk
//            FileOutputStream fos = new FileOutputStream("D://springboot_img//file.png"+(i+1)+".png");
//
//
//
//            while ((n = in.read(buffer)) > 0) {
//                fos.write(buffer, 0, n);
//            }
//
//// close the streams
//            fos.close();
//            in.close();
//            connection.disconnect();
//        }
//
//


//        crawlingDTO1.setContents(textResult);

//
//        String textTest1 = elements.text();

//        File file = new File("text.html");
//        Document document = Jsoup.parse(file,"utf-8");
//        System.out.println(document);
//        Elements elements = document.getElementsByAttributeValue("class","widget-match-standings__crest");
//        elements.forEach(el ->{
//            System.out.println(el);
//        });


    }


        public List<CrawlingDTO> findAll(){
            List<CrawlingEntity> crawlingEntityList = crawlingRepository.findAll();
            List<CrawlingDTO> crawlingDTOList = new ArrayList<>();

            for (CrawlingEntity crawlingEntity : crawlingEntityList) {
                crawlingDTOList.add(CrawlingDTO.coDTO(crawlingEntity));
            }
            return crawlingDTOList;
        }

    }

