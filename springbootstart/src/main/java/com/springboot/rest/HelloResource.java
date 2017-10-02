package com.springboot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

  @RequestMapping("/hi")
  public String greet() {
    return "Hello, I am your Springboot resource!";
  }
}