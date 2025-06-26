package org.example;

import java.util.ArrayList;

public class Factorizer {

    public ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (number <= 1) return factors;

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

    public boolean isPrime(int number) {
        ArrayList<Integer> factors = primeFactors(number);
        return factors.size() == 1 && factors.get(0) == number;
    }

    public boolean isComposite(int number) {
        return number > 1 && !isPrime(number);
    }

    public String reduce(int numerator, int denominator) {
        ArrayList<Integer> numFactors = primeFactors(numerator);
        ArrayList<Integer> denFactors = primeFactors(denominator);

        // Remove common factors
        for (int i = 0; i < numFactors.size(); i++) {
            int factor = numFactors.get(i);
            if (denFactors.contains(factor)) {
                numFactors.remove(i);
                denFactors.remove((Integer) factor);
                i--;
            }
        }

        // Multiply remaining factors
        int reducedNum = 1;
        for (int factor : numFactors) {
            reducedNum *= factor;
        }

        int reducedDen = 1;
        for (int factor : denFactors) {
            reducedDen *= factor;
        }

        if (reducedDen == 1) {
            return String.valueOf(reducedNum);
        } else {
            return reducedNum + "/" + reducedDen;
        }
    }
}
