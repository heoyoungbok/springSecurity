package com.its.springsecurity.controller;

import com.its.springsecurity.dto.CrawlingDTO;
import com.its.springsecurity.service.CrawlingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CrawlingController {
    private final CrawlingService crawlingService;

    @GetMapping("/craw")
    public String craw(Model model) throws IOException {
        List<CrawlingDTO> crawlList = crawlingService.craw();
        model.addAttribute("craw",crawlList);
        return "crawling";
    }

}
