package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {

  @Test
  void itReturnsEmptyListForZero() {
    Factorizer f = new Factorizer();
    assertEquals(new ArrayList<>(), f.primeFactors(0));
  }

  @Test
  void itReturnsEmptyListForOne() {
    Factorizer f = new Factorizer();
    assertEquals(new ArrayList<>(), f.primeFactors(1));
  }

  @Test
  void itReturnsCorrectFactorsForNine() {
    Factorizer f = new Factorizer();
    assertEquals(Arrays.asList(3, 3), f.primeFactors(9));
  }

  @Test
  void itReturnsCorrectFactorsForTen() {
    Factorizer f = new Factorizer();
    assertEquals(Arrays.asList(2, 5), f.primeFactors(10));
  }

  @Test
  void itReturnsCorrectFactorsForLargeNumber() {
    Factorizer f = new Factorizer();
    assertEquals(Arrays.asList(2, 2, 3, 3, 5), f.primeFactors(180));
  }
}
