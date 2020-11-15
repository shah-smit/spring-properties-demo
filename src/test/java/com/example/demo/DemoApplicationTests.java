package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

  @Autowired
  private CustomerPreferencesConfig customerPreferencesConfig;

  @Test
  void contextLoads() {
    assertNotNull(customerPreferencesConfig);
    System.out.println(customerPreferencesConfig.getTransactionId().get("02013"));
  }

}
