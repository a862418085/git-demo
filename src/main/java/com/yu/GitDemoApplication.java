package com.yu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("添加缓存区");
        System.out.println("添加缓存区2");
        System.out.println("push test1");
        System.out.println("push test2");
        System.out.println("push test33333");
         System.out.println("pull test444");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
