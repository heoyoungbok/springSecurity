package com.its.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringSecurityApplication {

//    private final UserArgumentResolver userArgumentResolver;


//    @Override
//    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
//        super.addArgumentResolvers(argumentResolvers);
//        argumentResolvers.add(userArgumentResolver);
//    }
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

}
