package fonyou.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FonYouApplication {
    public static void main(String[] args) {
        SpringApplication.run(FonYouApplication.class, args);

        System.out.println("we are here at fonyou world!");

    }
}
