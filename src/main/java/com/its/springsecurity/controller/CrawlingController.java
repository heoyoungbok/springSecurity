package com.its.springsecurity.controller;

import com.its.springsecurity.dto.*;
import com.its.springsecurity.service.CrawlingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;



@Controller
@RequiredArgsConstructor
public class CrawlingController {

    private final CrawlingService crawlingService;

    @GetMapping("/craw")
    public String craw(Model model ,CrawlingDTO crawlingDTO) throws IOException {
        crawlingService.craw(crawlingDTO);
        List<CrawlingDTO> crawList = crawlingService.findAll();
        model.addAttribute("crawList",crawList);

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
//
        model.addAttribute("imageUrls", imageUrls);
//        model.addAttribute("imageUrls",imageUrls);
        return "LeagueOne";
    }
//    @GetMapping("/l2")
//    public String l2Form(){
//        return "LeagueTwo";
//    }

    @GetMapping("/l2")
    public String l2(Model model , Crawling2DTO crawling2DTO) throws IOException {
        crawlingService.l2(crawling2DTO);
        List<Crawling2DTO> crawList2 = crawlingService.findAll2();
        model.addAttribute("crawList2",crawList2);
        String P1 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_agh9ifb2mw3ivjusgedj7c3fe.png";
        String P2 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3kq9cckrnlogidldtdie2fkbl.png";
        String P3 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_63f5h8t5e9qm1fqmvfkb23ghh.png";
        String P4 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3czravw89omgc9o4s0w3l1bg5.png";
        String P5 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4ku8o6uf87yd8iecdalipo6wd.png";
        String P6 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ah8dala7suqqkj04n2l8xz4zd.png";
        String P7 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_2l0ldgiwsgb8d6y3z0sfgjzyj.png";
        String P8 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3budh3j9xivsid3ptm8ptpy4k.png";
        String P9 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_74mcjsm72vr3l9pw2i4qfjchj.png";
        String P10 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ba5e91hjacvma2sjvixn00pjo.png";
        String P11 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_50x1m4u58lffhq6v6ga1hbxmy.png";
        String P12 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4jelr92fsge73q39is6qvhxb3.png";
        String P13 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_7h7eg7q7dbwvzww78h9d5eh0h.png";
        String P14 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_cobffe32r7g4skka9m19qib63.png";
        String P15 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1n1j0wsl763lq7ee1k0c11c02.png";
        String P16 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_c8llrezkm3b3op4afrou6b487.png";
        String P17 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6f27yvbqcngegwsg2ozxxdj4.png";
        String P18 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_10eyb18v5puw4ez03ocaug09m.png";
        String P19 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_82q9159y2u7mkfn3z6hy75r4o.png";
        String P20 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4yg9ttzw0m51048doksv8uq5r.png";
        List<String> imageUrls = Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20); //리스트에 담아줌
        model.addAttribute("imageUrls",imageUrls);
        return "LeagueTwo";

    }




    @GetMapping("/l3")
    public String l3(Model model , Crawling3DTO crawling3DTO) throws IOException {
        crawlingService.l3(crawling3DTO);
        List<Crawling3DTO> crawList3 = crawlingService.findAll3();
        model.addAttribute("crawList3",crawList3);

        String P1 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_apoawtpvac4zqlancmvw4nk4o.png";
        String P2 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6k5zscdm9ufw0tguvzyjlp5hq.png";
        String P3 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_9gefq4dz9b2hl8rqrxwrlrzmp.png";
        String P4 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_c5hderjlkcoaze51e5wgvptk.png";
        String P5 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_a8d2gb2nag8fy0itbuxmcibh2.png";
        String P6 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_dt4pinj0vw0t0cvz7za6mhmzy.png";
        String P7 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_a8l3w3n0j99qjlsxj3jnmgkz1.png";
        String P8 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_go76xxm0xyfgqt1h6tcrtimm.png";
        String P9 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_cu0eztmjcsbydyp53aleznorw.png";
        String P10 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_1c7qokc1j5z50cjj4tcu32haa.png";
        String P11 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4l9mrqzmajz5crzlz50mtbt6x.png";
        String P12 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_7ad69ngbpjuyzv96drf8d9sn2.png";
        String P13 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_8q1ul09cygzswb7tb456bmifv.png";
        String P14 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ex3psl8e3ajeypwjy4xfltpx6.png";
        String P15 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_f0w62l8zql3tukxsy8fqwp72x.png";
        String P16 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3dwlvz6cl4lcavvrg0y2dycrt.png";
        String P17 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_eq1oq6y61xnzq88zu0cnw131z.png";
        String P18 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_cz4a6wmzx2obyisadhgaccx7b.png";

        List<String> imageUrls = Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18);
        model.addAttribute("imageUrls",imageUrls);
        return "LeagueThree";
    }


    @GetMapping("/l4")
    public String l4(Model model , Crawling4DTO crawling4DTO) throws IOException {
        crawlingService.l4(crawling4DTO);
        List<Crawling4DTO> crawList4 = crawlingService.findAll4();
        model.addAttribute("crawList4",crawList4);
        String P1 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_gi0l1habji5hpgar77dl5jqe.png";
        String P2 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_9dntj5dioj5ex52yrgwzxrq9l.png";
        String P3 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_bqbbqm98ud8obe45ds9ohgyrd.png";
        String P4 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_btcy9nra9ak4m22ovr2ia6m5v.png";
        String P5 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3vo5mpj7catp66nrwwqiuhuup.png";
        String P6 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_e75syeuawg3ql8nwpi3vr2btz.png";
        String P7 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_2tk2l9sgktwc9jhzqdd4mpdtb.png";
        String P8 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_dxq76zcvnokq07cszdx0i6kve.png";
        String P9 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_7gnly6999wao1xarwct4p8fe9.png";
        String P10 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4raiad4l2j5lkfaz92pk4osb.png";
        String P11 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ej5er0oyngdw138yuumwqbyqt.png";
        String P12 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_49rkyo4do8uwj06geomw0xr4i.png";
        String P13 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_8le3orkfz6iix3jns6g9ojqjg.png";
        String P14 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_67z1gqyiuzpmmb15q5fy7ntc4.png";
        String P15 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6tuibxq39fdryu8ou06wcm0q3.png";
        String P16 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_bi1fxjrncd0ram0oi7ja1jyuo.png";
        String P17 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4klvxyeh3xcus4ongu7c00mgc.png";
        String P18 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_af91jdcs6x0bqkmdb78rokod2.png";
        String P19 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4plikfte18rv8v4l89z803d4y.png";
        String P20 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ap6blbxhq9elm62vw6tutzlwg.png";
        List<String> imageUrls = Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20);
                model.addAttribute("imageUrls",imageUrls);
        return "LeagueFour";


    }

    @GetMapping("/l5")
    public String l5(Model model , Crawling5DTO crawling5DTO) throws IOException {
        crawlingService.l5(crawling5DTO);
        List<Crawling5DTO> crawList5 = crawlingService.findAll5();
        model.addAttribute("crawList5",crawList5);

        String P1 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_20vymiy7bo8wkyxai3ew494fz.png";
        String P2 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_d0zdg647gvgc95xdtk1vpbkys.png";
        String P3 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_24fvcruwqrqvqa3aonf8c3zuy.png";
        String P4 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3kfktv64h7kg7zryax1wktr5r.png";
        String P5 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4tic29sox7m39fy1ztgv0jsiq.png";
        String P6 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_89w5c6pw7vn0dxypi61tt0g4k.png";
        String P7 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ccpscwdcm65czscrun048ecn5.png";
        String P8 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4vd2t5schmvvufrfib7f2vjdf.png";
        String P9 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_8iawijq7s9s6d85mjz8wdslki.png";
        String P10 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_8iawijq7s9s6d85mjz8wdslki.png";
        String P11 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_b79uipsy57y1jqpy07h4i5ovk.png";
        String P12 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3ebril33e08ddzob4bhq8awsr.png";
        String P13 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6hsriqr3ybvyg94w2k19oal50.png";
        String P14 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_dqk062lu0vm8epvytbm6r4mmf.png";
        String P15 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_cos9hxi16eitbcbthof7zrm4m.png";
        String P16 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3t0vjqtxc8wpjzv82i3oi2ova.png";
        String P17 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_ears40cp6opsgvhsy0dgyszpd.png";
        String P18 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6g9qrm72224jrk6tkxxxi8a9n.png";

        List<String> imageUrls = Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18);
        model.addAttribute("imageUrls",imageUrls);
        return "LeagueFive";


    }


    @GetMapping("/l6")
    public String l6(Model model , Crawling6DTO crawling6DTO) throws IOException {
        crawlingService.l6(crawling6DTO);
        List<Crawling6DTO> crawList6 = crawlingService.findAll6();
        model.addAttribute("crawList6",crawList6);
        String P1 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_2b3mar72yy8d6uvat1ka6tn3r.png";
        String P2 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3xedluek08t2ka7oypwuullcn.png";
        String P3 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_z1wbqtd0fz5t5eezjvrbld3h.png";
        String P4 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_27xvwccz8kpmqsefjv2b2sc0o.png";
        String P5 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_70nn27vgkt6l48lvv5e66q7ww.png";
        String P6 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4t4hod56fsj7utpjdor8so5q6.png";
        String P7 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_be2k34rut1lz79jxenabttqlc.png";
        String P8 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_121le8unjfzug3iu9pgkqa1c7.png";
        String P9 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_bx0cdmzr2gwr70ez72dorx82p.png";
        String P10 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_17o35s8assv3kamxowzz77k4r.png";
        String P11 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3c3jcs7vc1t6vz5lev162jyv7.png";
        String P12 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_4aghw9tyi8ba3ju1ne83gmf9w.png";
        String P13 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3unkqo2g6ag99gd5ynz1j7vse.png";
        String P14 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_2cjpmotqo8phcqfpgo9xf4gel.png";
        String P15 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_750ustvk4jfqmo8q4gnrcxy7z.png";
        String P16 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_3adj8hkws0z1al232bg2h6tk0.png";
        String P17 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_9bxav814mkuhueiyivyive82d.png";
        String P18 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_6xjy1q2m55iiwe8g1r1yffbc9.png";
        String P19 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_71ajatxnuhc5cnm3xvgdky49w.png";
        String P20 = "https://secure.cache.images.core.optasports.com/soccer/teams/30x30/uuid_75qj99fhg5c0ztj2tva5u4uii.png";
        List<String> imageUrls = Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20);
        model.addAttribute("imageUrls",imageUrls);
        return "LeagueSix";




    }







}
