package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>();

    if (n == null || n <= 1) {
      return factors;
    }

    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n = n / i;
      }
    }

    return factors;
  }
}
