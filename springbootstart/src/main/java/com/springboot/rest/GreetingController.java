package com.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.GreetingService;

import model.Greeting;

@RestController
public class GreetingController {

  @Autowired
  private GreetingService greetingService;

  /**
   * Ex: http://localhost:8080/greeting?name=jana
   *
   * @param name
   * @return
   */
  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return greetingService.getGreeting(name);
  }
}