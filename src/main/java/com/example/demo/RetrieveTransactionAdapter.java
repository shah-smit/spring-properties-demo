package com.example.demo;

public class RetrieveTransactionAdapter {
  private final CustomerPreferencesConfig customerPreferencesConfig;

  public RetrieveTransactionAdapter(
      CustomerPreferencesConfig customerPreferencesConfig) {
    this.customerPreferencesConfig = customerPreferencesConfig;
  }

  public String getTransactionDesc(String transactionId){
    return customerPreferencesConfig.getTransactionId().get(transactionId);
  }
}
