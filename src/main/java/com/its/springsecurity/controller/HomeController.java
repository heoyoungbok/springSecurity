package com.its.springsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class HomeController {
//    private final UserRepository userRepository;
////    private final UserEntity user;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    @Bean
//    public User userEntity() {
//        return new User();
//    }
    @GetMapping("/")
    public String getAuthorizationMessage(){
        return "index";
    }

//    @GetMapping("/user")
//    public @ResponseBody String user(@AuthenticationPrincipal PrincipalDetails principal){
//        return "user";
//    }

    @GetMapping("/login/OAuth2/code/google")
    public String login(){
        return "login";
    }

//    @GetMapping("/join")
//    public  String join() {
//        System.out.println("IndexController.java의 join");
//        return "join";
//
//    }
//    @GetMapping("/loginSuccess")
//    public String loginComplete(@SocialUser User user) {
//        return "redirect:/leagueOne";
//    }
////        @PostMapping("/joinProc")
//        public String joinProc(UserEntity user) {
//            System.out.println("회원가입 진행합니다 여긴 Controller.IndexController.java의 joinProc의 시작  user= "+user);
//            String rawPassword = user.getPassword();
//            String encPassword = bCryptPasswordEncoder.encode(rawPassword);
//            user.setPassword(encPassword);
//            user.setRore("ROLE_USER");
//            userRepository.save(user);
//            System.out.println("회원가입 진행합니다 여긴 Controller.IndexController.java의 joinProc의 끝(리턴전)  user= "+user);
//            return "redirect:/";
//        }

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





