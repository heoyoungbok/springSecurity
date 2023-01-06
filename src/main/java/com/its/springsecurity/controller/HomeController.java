package com.its.springsecurity.controller;

//import com.its.springsecurity.auth.PrincipalDetails;

import com.its.springsecurity.config.auth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class HomeController {
//    private final UserService userService;
    private final HttpSession httpSession;
//    private final UserRepository userRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    private static final String authorizationRequestBaseUri = "oauth2/authorization";
//    Map<String, String> oauth2AuthenticationUrls = new HashMap<>();
//    private final ClientRegistrationRepository clientRegistrationRepository;





    @GetMapping("/")
    public String index(Model model) {

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }


//    @Autowired
//    private PasswordEncoder passwordEncoder;
//@Autowired
// private PasswordEncoder passwordEncoder;
////    private final UserEntity user;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    @Bean
//    public User userEntity() {
//        return new User();
//    }

    //   @GetMapping("/")
//   public String home(){
//       return "index";
//   }
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "join";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }

    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }
//    @GetMapping("/oauth/loginInfo")
//    @ResponseBody
//    public String oauthLoginInfo(Authentication authentication, @AuthenticationPrincipal OAuth2User oAuth2UserPrincipal){
//        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
//        Map<String, Object> attributes = oAuth2User.getAttributes();
//        System.out.println(attributes);
//        // PrincipalOauth2UserService의 getAttributes내용과 같음
//
//        Map<String, Object> attributes1 = oAuth2UserPrincipal.getAttributes();
//        // attributes == attributes1
//
//        return attributes.toString();     //세션에 담긴 user가져올 수 있음음
//    }
//
//    @GetMapping("/loginInfo")
//    @ResponseBody
//    public String loginInfo(Authentication authentication, @AuthenticationPrincipal PrincipalDetails principalDetails){
//        String result = "";
//
//        PrincipalDetails principal = (PrincipalDetails) authentication.getPrincipal();
//        if(principal.getUser().getProvider() == null) {
//            result = result + "Form 로그인 : " + principal;
//        }else{
//            result = result + "OAuth2 로그인 : " + principal;
//        }
//        return result;
//    }
//
//    @PostMapping("/join")
//    public String join(@ModelAttribute User user){
//        user.setRole(Role.USER);
//
//        String encodePwd = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodePwd);
//
//        userRepository.save(user);  //반드시 패스워드 암호화해야함
//        return "redirect:/loginForm";
//    }

//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("posts", userService.findAllDesc());
//
//        SessionUser user = (SessionUser) httpSession.getAttribute("user");
//        if (user != null) {
//            model.addAttribute("socialName", user.getName());
//            return "index";
//
//        }
//        return "login";
//    }


//    @GetMapping("/posts/save")
//    public String postsSave(){
//        return "posts-save";
//    }
//        @GetMapping("/login")
//        public String loginForm () {
//            return "login";
//        }

    }
//    @GetMapping("/login1")
//    public String login(Model model){
//            model.addAttribute("posts", userService.findAllDesc());
//
//            SessionUser user = (SessionUser) httpSession.getAttribute("user");
//
//            if(user != null){
//                model.addAttribute("userName", user.getName());
//            }
//
//        return "index";


//    @GetMapping("/user")
//    public @ResponseBody String user(@AuthenticationPrincipal PrincipalDetails principal){
//        return "user";
//    }





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




