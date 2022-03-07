package com.example.emos.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class EmosWxApi2Application {

    public static void main(String[] args) {
        SpringApplication.run(EmosWxApi2Application.class, args);
    }

}
