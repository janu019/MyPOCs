package com.springboot.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import model.Greeting;

@Service
/*
 * <TIP> : When you do @Service annotated, you don't need define the bean in config
 */
public class GreetingService {

  private static final String template = "Hello, Mr. %s!";
  private final AtomicLong counter = new AtomicLong();

  public Greeting getGreeting(String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}
