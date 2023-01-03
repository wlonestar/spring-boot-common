package com.wjl.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author <a href="mailto:wlonestar@163.com">wjl</a>
 * @time 2023/1/3 12:25
 * @version 0.0.1
 */
@Configuration
public class CORSConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
        .allowedOriginPatterns()
        .maxAge(3600)
        .allowedHeaders("*");
  }

}
