package org.example;

public class App {
    public static void main(String[] args) {
        Factorizer factorizer = new Factorizer();

        System.out.println("Prime factors of 12: " + factorizer.primeFactors(12));
        System.out.println("Is 17 prime? " + factorizer.isPrime(17));
        System.out.println("Is 12 composite? " + factorizer.isComposite(12));
        System.out.println("Reduce 36/12: " + factorizer.reduce(36, 12));
        System.out.println("Reduce 12/14: " + factorizer.reduce(12, 14));
        System.out.println("Reduce 12/37: " + factorizer.reduce(12, 37));
    }
}
