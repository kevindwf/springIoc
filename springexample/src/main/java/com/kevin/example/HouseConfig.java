package com.kevin.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HouseConfig {

    @Bean(name="house")
    public House getHouse(){
        return new House();
    }
}
