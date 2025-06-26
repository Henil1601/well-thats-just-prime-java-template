package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to factor: ");
        int number = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>(factorizer.primeFactors(number));
        System.out.println("Prime factors: " + result);

        System.out.print("Enter a number to check if prime: ");
        int primeTest = scanner.nextInt();
        System.out.println("Is Prime: " + factorizer.isPrime(primeTest));

        System.out.print("Enter a number to check if composite: ");
        int compositeTest = scanner.nextInt();
        System.out.println("Is Composite: " + factorizer.isComposite(compositeTest));

        System.out.print("Enter numerator for reduce: ");
        int num = scanner.nextInt();
        System.out.print("Enter denominator for reduce: ");
        int den = scanner.nextInt();
        System.out.println("Reduced fraction: " + factorizer.reduce(num, den));

        scanner.close();
    }
}
