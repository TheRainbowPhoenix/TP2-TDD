/**
 * @Author: uapv1701795
 * @Date:   2018-11-27T11:05:16+01:00
 * @Last modified by:   uapv1701795
 * @Last modified time: 2018-11-27T11:47:11+01:00
 */

 package com.FizzBuzz;

 import static org.junit.jupiter.api.Assertions.assertEquals;

 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.params.ParameterizedTest;
 import org.junit.jupiter.params.provider.CsvSource;


class FizzBuzzTest {
  @Test
  void shouldPass() {
    System.out.println("Vous passerez !");
  }
  @Test
  @DisplayName("return 1")
  void shouldReturn1When1() {
    FizzBuzz FB = new FizzBuzz();
    assertEquals("1", FB.getResult(1));
  }
 }
