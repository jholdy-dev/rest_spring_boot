package com.jholdy.dev.rest_spring_boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StartupTests {

  @Test
  void contextLoads() {
  }

  @Test
  void GreetingControllerTest() {
    var greetingController = new com.jholdy.dev.rest_spring_boot.controllers.GreetingController();
    var greeting = greetingController.greeting("World");
    assert greeting.id() == 1;
    assert greeting.content().equals("Hello, World!");
  }
}
