package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("添加缓存区");
        System.out.println("添加缓存区2");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
