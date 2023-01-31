package com.its.springsecurity.config;


import com.its.springsecurity.domain.user.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {






    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .antMatchers("/admin/**").hasRole(Role.ADMIN.name())
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .loginPage("/login")
                .defaultSuccessUrl("/");


//                .baseUri("/oauth2/code/*")


        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/webjars/**","/th/**");
    }



}
