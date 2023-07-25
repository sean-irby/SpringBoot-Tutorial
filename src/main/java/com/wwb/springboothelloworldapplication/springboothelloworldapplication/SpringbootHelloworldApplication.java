package com.wwb.springboothelloworldapplication.springboothelloworldapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

//    @Bean
//    public FilterRegistrationBean corsFilter() {
//        FilterRegistrationBean bean = new FilterRegistrationBean(new CORSFilter());
//        return bean;
//    }
}
