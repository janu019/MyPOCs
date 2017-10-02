package com.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
/**
 * This class starts the application. @ComponentScan will scan the pacages mentioned, by default it
 * look for all the packages below this class.
 *
 * <Tip>: always have Application in root package.
 *
 * @see https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-structuring-your-code.html
 *
 * @author janareddy
 *
 */
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

//    SpringApplication sApp= new SpringApplication(Application.class);
//    sApp.setBannerMode(Mode.OFF);
//    sApp.run(args);
  }
}