package me.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot11Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Springboot11Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
//    @Bean
//    public Holoman holoman(){
//        Holoman holoman = new Holoman();
//        holoman.setHowLong(30);
//        holoman.setName("keesun1");
//        return holoman;
//    }

}
