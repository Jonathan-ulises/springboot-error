package com.jona.curso.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jona.curso.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {


    @Bean
    List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Jonathan", "Sanchez"));
        users.add(new User(2L, "Luis", "Aranda"));
        users.add(new User(3L, "Oscar", "Ramirez"));
        users.add(new User(4L, "Leo", "Messi"));
        users.add(new User(5L, "Israel", "Edo"));
        return users;
    }
    
}
