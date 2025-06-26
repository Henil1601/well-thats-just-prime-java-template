package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FactorizerTest {

    @Test
    public void testPrimeFactors() {
        Factorizer f = new Factorizer();
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, f.primeFactors(6));
    }

    @Test
    public void testIsPrime() {
        Factorizer f = new Factorizer();
        assertTrue(f.isPrime(17));
        assertFalse(f.isPrime(12));
        assertFalse(f.isPrime(1));
    }

    @Test
    public void testIsComposite() {
        Factorizer f = new Factorizer();
        assertTrue(f.isComposite(12));
        assertFalse(f.isComposite(17));
        assertFalse(f.isComposite(1));
    }

    @Test
    public void testReduce() {
        Factorizer f = new Factorizer();
        assertEquals("3", f.reduce(36, 12));
        assertEquals("1", f.reduce(12, 12));
        assertEquals("6/7", f.reduce(12, 14));
        assertEquals("12/37", f.reduce(12, 37));
    }
}
