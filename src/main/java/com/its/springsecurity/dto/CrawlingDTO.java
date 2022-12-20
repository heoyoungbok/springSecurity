package com.its.springsecurity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CrawlingDTO {
    private String image;
    private String name;
    private String subject;
    private String team;

    private String lose;

    private String win;
    private String url;
}
