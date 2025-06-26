package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FactorizerTest {

    @Test
    void testPrimeFactorsBasic() {
        Factorizer f = new Factorizer();
        assertEquals(Arrays.asList(3, 3), f.primeFactors(9));
        assertEquals(Arrays.asList(2, 5), f.primeFactors(10));
        assertEquals(new ArrayList<>(), f.primeFactors(1));
        assertEquals(new ArrayList<>(), f.primeFactors(0));
    }

    @Test
    void testIsPrime() {
        Factorizer f = new Factorizer();
        assertTrue(f.isPrime(17));
        assertFalse(f.isPrime(36));
        assertFalse(f.isPrime(1));
        assertFalse(f.isPrime(0));
    }

    @Test
    void testIsComposite() {
        Factorizer f = new Factorizer();
        assertTrue(f.isComposite(36));
        assertTrue(f.isComposite(12));
        assertFalse(f.isComposite(17));
        assertFalse(f.isComposite(1));
        assertFalse(f.isComposite(0));
    }

    @Test
    void testReduce() {
        Factorizer f = new Factorizer();
        assertEquals("3", f.reduce(36, 12));
        assertEquals("1", f.reduce(12, 12));
        assertEquals("6/7", f.reduce(12, 14));
        assertEquals("12/37", f.reduce(12, 37));
        assertEquals("Undefined", f.reduce(12, 0));
    }
}
