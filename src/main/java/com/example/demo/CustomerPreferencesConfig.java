package com.example.demo;

import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "epayment.preference-notification")
public class CustomerPreferencesConfig {

  private Map<String, String> transactionId;

  public Map<String, String> getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Map<String, String> message) {
    this.transactionId = message;
  }

}
