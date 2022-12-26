package com.its.springsecurity.service;

import com.its.springsecurity.dto.*;
import com.its.springsecurity.entity.*;
import com.its.springsecurity.repository.*;
import lombok.RequiredArgsConstructor;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CrawlingService {
    //    private final WebConfig webConfig;
    private final CrawlingRepository crawlingRepository;
    private final CrawlingRepository2 crawlingRepository2;

    private final CrawlingRepository3 crawlingRepository3;

    private final CrawlingRepository4 crawlingRepository4;

    private final CrawlingRepository5 crawlingRepository5;

    private final CrawlingRepository6 crawlingRepository6;

    public void craw(CrawlingDTO crawlingDTO) throws IOException {
//        String url2 = "https://www.zentoto.com/sports/soccer/epl"; // 사설
//        Document document = Jsoup.connect(url2).get();
//        Elements elements = document.getElementsByAttributeValue("class", "standing-team");
//        Element element = elements.get(0);
//        Elements contents = element.select("tbody");
//        Elements td1Elements = contents.select("td img"); // 사진
//        Elements src1 = td1Elements.select("src");
////        System.out.println(td1Elements.size());
//        Elements nameElements = contents.select("tr td a"); // 팀 이름
//        Elements tdElements = contents.select("tr td"); //
//        Elements spanElements = contents.select("tr td span");       // 승리
//        System.out.println(tdElements.size());
//        String name = nameElements.text(); // 팀이름 추출
//        System.out.println(name);
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
//        System.out.println(img);
        Elements src = img.select("src");
        Elements names = cons.select("tbody tr"); // 팀 이름
        Elements tNames = names.select("tr ");
//        System.out.println(tNames); // td 접근
        Elements td = tNames.select("td");
        Elements elem2 = doc.getElementsByAttributeValue("class", "widget-match-standings__team--full-name");
//        System.out.println(elem2);
        Elements team = td.select("span");
//        System.out.println(team);
//        System.out.println(team.size());
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

        Elements elements7 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-for");
        Elements goals = elements7.select("td");

        Elements elements8 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-against");
        Elements goalLost = elements8.select("td");

//        Set<CrawlingEntity> uniqueContents = new HashSet<>();    // td에 대한 전체 포문
        CrawlingDTO crawlingDTO1 = new CrawlingDTO();
        CrawlingEntity entity = new CrawlingEntity();
//        for (int i = 0; i < tNames.size(); i++) {
//            Element result;
//            result = tNames.get(i);
//            String result1 = result.text();
//            crawlingDTO1.setTeam(result1);
//            uniqueContents.add(entity);
//            CrawlingEntity crawlingEntity = CrawlingEntity.toSaveEntity(crawlingDTO1);
//
//            // 같은 이름이 중복될시 저장되는 건 미확인
//            for (CrawlingEntity crawling : uniqueContents) {
//                crawlingRepository.save(crawling);
//
////                String textResult = result.
////                System.out.println(result1);
//
////        List<Elements> crawlingDTOList = Arrays.asList(elem2,games,wins,draws,lost,goals,goalLost,diff,points);
//
//
//        List<CrawlingEntity> crawlingEntityList = new ArrayList<>();
//        for (int i = 0; i < elem2.size(); i++) {     // 반복문을 통해 저장처리
//            CrawlingDTO crawDTO = new CrawlingDTO();
//            crawDTO.setTeam(elem2.get(i).text());
//            crawDTO.setGames(games.get(i).text());
//            crawDTO.setWin(wins.get(i).text());
//            crawDTO.setDraw(draws.get(i).text());
//            crawDTO.setLose(lost.get(i).text());
//            crawDTO.setPlus(goals.get(i).text());
//            crawDTO.setMinus(goalLost.get(i).text());
//            crawDTO.setDiff(diff.get(i).text());
//            crawDTO.setPoint(points.get(i).text());
////            crawlingEntityList.add(CrawlingEntity.toSaveEntity(crawDTO));
//            crawlingRepository.save(CrawlingEntity.toSaveEntity(crawDTO));
//        }


//        for (int i = 0; i < src.size(); i++) {
//            Element result = src.get(i);
//            System.out.println(result);
////            // src 속성 값에서 파일 이름을 잘라냄
////            String url = result.attr("src");
////            String[] splitUrl = result.attr("src").split("/");
////            String fileName = splitUrl[splitUrl.length-1];
////            // 파일 다운로드
////
////            this.saveAttach(url,fileName,sessinId);
////            // img 태그의 src 속성을 다운로드한 파일로 수정
////
////            result.attr("src",fileName);
//        }
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
        String P1 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4dsgumo7d4zupm2ugsvm4zm4d.png";
        String P2 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_a3nyxabgsqlnqfkeg41m6tnpp.png";
        String P3 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_7vn2i2kd35zuetw6b38gw9jsz.png";
        String P4 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_22doj4sgsocqpxw45h607udje.png";
        String P5 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6eqit8ye8aomdsrrq0hk3v7gh.png";
        String P6 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_c8h9bw1l82s06h77xxrelzhur.png";
        String P7 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_e5p0ehyguld7egzhiedpdnc3w.png";
        String P8 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_9q0arba2kbnywth8bkxlhgmdr.png";
        String P9 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_hzqh7z0mdl3v7gwete66syxp.png";
        String P10 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_7yx5dqhhphyvfisohikodajhv.png";
        String P11 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1c8m2ko0wxq1asfkuykurdr0y.png";
        String P12 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_b496gs285it6bheuikox6z9mj.png";
        String P13 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_avxknfz4f6ob0rv9dbnxdzde0.png";
        String P14 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1pse9ta7a45pi2w2grjim70ge.png";
        String P15 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_48gk2hpqtsl6p9sx9kjhaydq4.png";
        String P16 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4txjdaqveermfryvbfrr4taf7.png";
        String P17 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ehd2iemqmschhj2ec0vayztzz.png";  // 해당 url 웹크롤링이 불가능 한 것 같아 직접 접근을 하여 복사
        String P18 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1qtaiy11gswx327s0vkibf70n.png";
        String P19 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_d5ydtvt96bv7fq04yqm2w2632.png";
        String P20 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_b9si1jn1lfxfund69e9ogcu2n.png";
        List<String> imageUrls = Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20); //리스트에 담아줌


        for (int i = 0; i < imageUrls.size(); i++) {   // 이미지 웹크롤링

            String imageUrl = imageUrls.get(i);
//            Element text = result.select(src.text()).get(i);
//            System.out.println(text);
            Connection.Response response = Jsoup.connect(imageUrl)
                    .ignoreContentType(true)
                    .userAgent("MyJavaClient/1.0")
                    .method(Connection.Method.GET)
                    .execute();


            try (InputStream inputStream = response.bodyStream();
                 FileOutputStream fos = new FileOutputStream("D://springboot_img//file.png" + (i + 1) + ".png")) {

//            Connection.Response response =
//                    (Connection.Response) Jsoup.connect(imageUrl).ignoreContentType(true).execute();
                byte[] buffer = new byte[1024];
                int n;
                while ((n = inputStream.read(buffer)) != -1) {
                    fos.write(buffer, 0, n);
                }

//            fos.write(imageData);
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

        }


        //
//            String fileUrl = td1Elements.attr("src");
//            URL url = new URL(u+fileUrl);
//            URLEncoder.encode(u);
////            try {
////
//////                url = new URL(fileUrl);
////            } catch (MalformedURLException e) {
////                e.printStackTrace();
////                continue;
////            }
//
//
//
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setRequestMethod("GET");
//                connection.setRequestProperty("User-Agent",",MyJavaClient/1.0");
//                connection.connect();
////                int responseCode = connection.getResponseCode();
////                String responseMessage = connection.getResponseMessage();
////                Map<String,List<String>> headers = connection.getHeaderFields();
//
//
////            InputStream in;
//
//            try (InputStream inputStream = connection.getInputStream();
//                FileOutputStream fos = new FileOutputStream("D://springboot_img//file.png" + (i + 1) + ".png")) {
//                int contentLength = 0;
//                byte[] buffer = new byte[1024];
//                int n;
//
//
//                while ((n = inputStream.read(buffer)) != -1) {
//                    contentLength += n;
//                    fos.write(buffer,0,n);
//                }
////                    connection.setRequestProperty("Content-Length", Integer.toString(contentLength));
//                connection.setRequestProperty("Accept-Encoding", "gzip");
////                    fos.write(buffer, 0, n); // 저장 쿼리
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//                continue;
//            } finally {
//                connection.disconnect();
//            }


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
            List<CrawlingDTO> crawlingDTOList =  crawlingEntityList.stream()
                    .map(CrawlingDTO::coDTO)
                    .collect(Collectors.toList());

//
//            for (CrawlingEntity crawlingEntity : crawlingEntityList) {
//                crawlingDTOList.add(CrawlingDTO.coDTO(crawlingEntity));
//            }
            return crawlingDTOList;
        }

        public List<Crawling2DTO> findAll2(){
        List<CrawlingEntity2> crawlingEntityList = crawlingRepository2.findAll();
        List<Crawling2DTO> crawling2DTOList = crawlingEntityList.stream()
                .map(Crawling2DTO::coDTO2)
                .collect(Collectors.toList());
                return crawling2DTOList;
        }

    public List<Crawling3DTO> findAll3() {
        List<CrawlingEntity3> crawlingEntityList = crawlingRepository3.findAll();
        List<Crawling3DTO> crawling3DTOList = crawlingEntityList.stream()
                .map(Crawling3DTO::coDTO3)
                .collect(Collectors.toList());
        return crawling3DTOList;
    }

    public List<Crawling4DTO> findAll4() {
        List< CrawlingEntity4> crawlingEntityList = crawlingRepository4.findAll();
        List<Crawling4DTO> crawling4DTOList = crawlingEntityList.stream()
                .map(Crawling4DTO::coDTO4)
                .collect(Collectors.toList());
        return crawling4DTOList;
    }

    public List<Crawling5DTO> findAll5() {
        List<CrawlingEntity5> crawlingEntityList = crawlingRepository5.findAll();
        List<Crawling5DTO> crawling5DTOList = crawlingEntityList.stream()
                .map(Crawling5DTO::coDTO5)
                .collect(Collectors.toList());
        return crawling5DTOList;
    }

    public List<Crawling6DTO> findAll6() {
        List< CrawlingEntity6> crawlingEntityList = crawlingRepository6.findAll();
        List<Crawling6DTO> crawling6DTOList = crawlingEntityList.stream()
                .map(Crawling6DTO::coDTO6)
                .collect(Collectors.toList());
        return crawling6DTOList;
    }




    public void l2(Crawling2DTO crawling2DTO) throws IOException {
        String U = "https://www.goal.com/kr/%ED%94%84%EB%A6%AC%EB%A9%94%EB%9D%BC%EB%A6%AC%EA%B0%80/%EC%88%9C%EC%9C%84/34pl8szyvrbwcmfkuocjm3r6t";
        Document doc = Jsoup.connect(U).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");

        Elements elem2 = doc.getElementsByAttributeValue("class", "widget-match-standings__team--full-name");
//        System.out.println(elem2);
        Elements elements1 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-played");
        Elements games = elements1.select("td");
//        System.out.println(games);
        Elements elements2 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-won");
        Elements wins = elements2.select("td");
//        System.out.println(wins);

        Elements elements3 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-drawn");
        Elements draws = elements3.select("td");
//        System.out.println(draws);
        Elements elements4 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-lost");
        Elements lost = elements4.select("td");
//        System.out.println(lost);
        Elements elements5 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-diff");
        Elements diff = elements5.select("td");
//        System.out.println(diff);
        Elements elements6 = doc.getElementsByAttributeValue("class", "widget-match-standings__pts");
        Elements points = elements6.select("td");
//        System.out.println(points);
        Elements elements7 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-for");
        Elements goals = elements7.select("td");
//        System.out.println(goals);
        Elements elements8 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-against");
        Elements goalLost = elements8.select("td");
//        System.out.println(goalLost);


//        List<CrawlingEntity2> crawlingEntityList2 = new ArrayList<>();
//        for (int i = 0; i < elem2.size(); i++) {     // 반복문을 통해 저장처리
//            Crawling2DTO craw2DTO = new Crawling2DTO();
//            craw2DTO.setTeam(elem2.get(i).text());
//            craw2DTO.setGames(games.get(i).text());
//            craw2DTO.setWin(wins.get(i).text());
//            craw2DTO.setDraw(draws.get(i).text());
//            craw2DTO.setLose(lost.get(i).text());
//            craw2DTO.setPlus(goals.get(i).text());
//            craw2DTO.setMinus(goalLost.get(i).text());
//            craw2DTO.setDiff(diff.get(i).text());
//            craw2DTO.setPoint(points.get(i).text());
////            crawlingEntityList2.add(CrawlingEntity2.toSaveEntity(craw2DTO));
//            crawlingRepository2.save(CrawlingEntity2.toSaveEntity(craw2DTO));
//
//        }



    }

    public void l3(Crawling3DTO crawling3DTO) throws IOException {
        String u3 = "https://www.goal.com/kr/%EB%B6%84%EB%8D%B0%EC%8A%A4%EB%A6%AC%EA%B0%80/%EC%88%9C%EC%9C%84/6by3h89i2eykc341oz7lv1ddd";
        Document doc = Jsoup.connect(u3).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");

        Elements elem2 = doc.getElementsByAttributeValue("class", "widget-match-standings__team--full-name");
//        System.out.println(elem2);
        Elements elements1 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-played");
        Elements games = elements1.select("td");
//        System.out.println(games);
        Elements elements2 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-won");
        Elements wins = elements2.select("td");
//        System.out.println(wins);

        Elements elements3 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-drawn");
        Elements draws = elements3.select("td");
//        System.out.println(draws);
        Elements elements4 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-lost");
        Elements lost = elements4.select("td");
//        System.out.println(lost);
        Elements elements5 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-diff");
        Elements diff = elements5.select("td");
//        System.out.println(diff);
        Elements elements6 = doc.getElementsByAttributeValue("class", "widget-match-standings__pts");
        Elements points = elements6.select("td");
//        System.out.println(points);
        Elements elements7 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-for");
        Elements goals = elements7.select("td");
//        System.out.println(goals);
        Elements elements8 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-against");
        Elements goalLost = elements8.select("td");
//        System.out.println(goalLost);

//        List<CrawlingEntity3> crawlingEntityList3 = new ArrayList<>();
//        for (int i = 0; i < elem2.size(); i++) {     // 반복문을 통해 저장처리
//            Crawling3DTO craw3DTO = new Crawling3DTO();
//            craw3DTO.setTeam(elem2.get(i).text());
//            craw3DTO.setGames(games.get(i).text());
//            craw3DTO.setWin(wins.get(i).text());
//            craw3DTO.setDraw(draws.get(i).text());
//            craw3DTO.setLose(lost.get(i).text());
//            craw3DTO.setPlus(goals.get(i).text());
//            craw3DTO.setMinus(goalLost.get(i).text());
//            craw3DTO.setDiff(diff.get(i).text());
//            craw3DTO.setPoint(points.get(i).text());
////            crawlingEntityList2.add(CrawlingEntity2.toSaveEntity(craw2DTO));
//            crawlingRepository3.save(CrawlingEntity3.toSaveEntity(craw3DTO));
//
//        }



    }


    public void l4(Crawling4DTO crawling4DTO) throws IOException {
        String u4 = "https://www.goal.com/kr/%EC%84%B8%EB%A6%AC%EC%97%90-a/%EC%88%9C%EC%9C%84/1r097lpxe0xn03ihb7wi98kao";
        Document doc = Jsoup.connect(u4).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");

        Elements elem2 = doc.getElementsByAttributeValue("class", "widget-match-standings__team--full-name");
//        System.out.println(elem2);
        Elements elements1 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-played");
        Elements games = elements1.select("td");
//        System.out.println(games);
        Elements elements2 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-won");
        Elements wins = elements2.select("td");
//        System.out.println(wins);

        Elements elements3 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-drawn");
        Elements draws = elements3.select("td");
//        System.out.println(draws);
        Elements elements4 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-lost");
        Elements lost = elements4.select("td");
//        System.out.println(lost);
        Elements elements5 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-diff");
        Elements diff = elements5.select("td");
//        System.out.println(diff);
        Elements elements6 = doc.getElementsByAttributeValue("class", "widget-match-standings__pts");
        Elements points = elements6.select("td");
//        System.out.println(points);
        Elements elements7 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-for");
        Elements goals = elements7.select("td");
//        System.out.println(goals);
        Elements elements8 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-against");
        Elements goalLost = elements8.select("td");
//        System.out.println(goalLost);

//        List<CrawlingEntity4> crawlingEntityList4 = new ArrayList<>();
//        for (int i = 0; i < elem2.size(); i++) {     // 반복문을 통해 저장처리
//            Crawling4DTO craw4DTO = new Crawling4DTO();
//            craw4DTO.setTeam(elem2.get(i).text());
//            craw4DTO.setGames(games.get(i).text());
//            craw4DTO.setWin(wins.get(i).text());
//            craw4DTO.setDraw(draws.get(i).text());
//            craw4DTO.setLose(lost.get(i).text());
//            craw4DTO.setPlus(goals.get(i).text());
//            craw4DTO.setMinus(goalLost.get(i).text());
//            craw4DTO.setDiff(diff.get(i).text());
//            craw4DTO.setPoint(points.get(i).text());
////            crawlingEntityList2.add(CrawlingEntity2.toSaveEntity(craw2DTO));
//            crawlingRepository4.save(CrawlingEntity4.toSaveEntity(craw4DTO));
//
//        }

    }

    public void l5(Crawling5DTO crawling5DTO) throws IOException {
        String u5 = "https://www.goal.com/kr/%EC%97%90%EB%A0%88%EB%94%94%EB%B9%84%EC%A7%80/%EC%88%9C%EC%9C%84/akmkihra9ruad09ljapsm84b3";
        Document doc = Jsoup.connect(u5).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");

        Elements elem2 = doc.getElementsByAttributeValue("class", "widget-match-standings__team--full-name");
//        System.out.println(elem2);
        Elements elements1 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-played");
        Elements games = elements1.select("td");
//        System.out.println(games);
        Elements elements2 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-won");
        Elements wins = elements2.select("td");
//        System.out.println(wins);

        Elements elements3 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-drawn");
        Elements draws = elements3.select("td");
//        System.out.println(draws);
        Elements elements4 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-lost");
        Elements lost = elements4.select("td");
//        System.out.println(lost);
        Elements elements5 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-diff");
        Elements diff = elements5.select("td");
//        System.out.println(diff);
        Elements elements6 = doc.getElementsByAttributeValue("class", "widget-match-standings__pts");
        Elements points = elements6.select("td");
//        System.out.println(points);
        Elements elements7 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-for");
        Elements goals = elements7.select("td");
//        System.out.println(goals);
        Elements elements8 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-against");
        Elements goalLost = elements8.select("td");
//        System.out.println(goalLost);

//        List<CrawlingEntity5> crawlingEntityList5 = new ArrayList<>();
//        for (int i = 0; i < elem2.size(); i++) {     // 반복문을 통해 저장처리
//            Crawling5DTO craw5DTO = new Crawling5DTO();
//            craw5DTO.setTeam(elem2.get(i).text());
//            craw5DTO.setGames(games.get(i).text());
//            craw5DTO.setWin(wins.get(i).text());
//            craw5DTO.setDraw(draws.get(i).text());
//            craw5DTO.setLose(lost.get(i).text());
//            craw5DTO.setPlus(goals.get(i).text());
//            craw5DTO.setMinus(goalLost.get(i).text());
//            craw5DTO.setDiff(diff.get(i).text());
//            craw5DTO.setPoint(points.get(i).text());
////            crawlingEntityList2.add(CrawlingEntity2.toSaveEntity(craw2DTO));
//            crawlingRepository5.save(CrawlingEntity5.toSaveEntity(craw5DTO));
//
//        }
   }

    public void l6(Crawling6DTO crawling6DTO) throws IOException {

        String u6 = "https://www.goal.com/kr/%EB%A6%AC%EA%B7%B8-1/%EC%88%9C%EC%9C%84/dm5ka0os1e3dxcp3vh05kmp33";
        Document doc = Jsoup.connect(u6).get();
        Elements elem = doc.getElementsByAttributeValue("class", "main-content");

        Elements elem2 = doc.getElementsByAttributeValue("class", "widget-match-standings__team--full-name");
//        System.out.println(elem2);
        Elements elements1 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-played");
        Elements games = elements1.select("td");
//        System.out.println(games);
        Elements elements2 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-won");
        Elements wins = elements2.select("td");
//        System.out.println(wins);

        Elements elements3 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-drawn");
        Elements draws = elements3.select("td");
//        System.out.println(draws);
        Elements elements4 = doc.getElementsByAttributeValue("class", "widget-match-standings__matches-lost");
        Elements lost = elements4.select("td");
//        System.out.println(lost);
        Elements elements5 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-diff");
        Elements diff = elements5.select("td");
//        System.out.println(diff);
        Elements elements6 = doc.getElementsByAttributeValue("class", "widget-match-standings__pts");
        Elements points = elements6.select("td");
//        System.out.println(points);
        Elements elements7 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-for");
        Elements goals = elements7.select("td");
//        System.out.println(goals);
        Elements elements8 = doc.getElementsByAttributeValue("class", "widget-match-standings__goals-against");
        Elements goalLost = elements8.select("td");
//        System.out.println(goalLost);

//        List<CrawlingEntity6> crawlingEntityList6 = new ArrayList<>();
//        for (int i = 0; i < elem2.size(); i++) {     // 반복문을 통해 저장처리
//            Crawling6DTO craw6DTO = new Crawling6DTO();
//            craw6DTO.setTeam(elem2.get(i).text());
//            craw6DTO.setGames(games.get(i).text());
//            craw6DTO.setWin(wins.get(i).text());
//            craw6DTO.setDraw(draws.get(i).text());
//            craw6DTO.setLose(lost.get(i).text());
//            craw6DTO.setPlus(goals.get(i).text());
//            craw6DTO.setMinus(goalLost.get(i).text());
//            craw6DTO.setDiff(diff.get(i).text());
//            craw6DTO.setPoint(points.get(i).text());
////            crawlingEntityList2.add(CrawlingEntity2.toSaveEntity(craw2DTO));
//            crawlingRepository6.save(CrawlingEntity6.toSaveEntity(craw6DTO));
//
//        }
    }





    }

