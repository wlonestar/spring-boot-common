package com.wjl.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class ProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProjectApplication.class, args);
  }

}
