package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Factorizer factorizer = new Factorizer();

    System.out.print("Enter a number to factorize: ");
    int number = scanner.nextInt();

    System.out.println("Prime factors: " + factorizer.primeFactors(number));
  }
}
