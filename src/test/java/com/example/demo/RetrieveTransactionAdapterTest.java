package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RetrieveTransactionAdapterTest {

  @InjectMocks
  private RetrieveTransactionAdapter retrieveTransactionAdapter;

  @Mock
  private CustomerPreferencesConfig customerPreferencesConfig;

  @Test
  public void testShouldRetrieveCorrectDescriptionWhenValidIdProvided() {
    when(customerPreferencesConfig.getTransactionId()).thenReturn(Map.of("String1", "String2"));

    assertNotNull(customerPreferencesConfig.getTransactionId());
    assertEquals("String2", retrieveTransactionAdapter.getTransactionDesc("String1"));
  }
}