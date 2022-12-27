package com.its.springsecurity;

import com.its.springsecurity.config.properties.AppProperties;
import com.its.springsecurity.config.properties.CorsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
        CorsProperties.class,
        AppProperties.class
})
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
