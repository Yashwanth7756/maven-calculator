
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterestCalculatorTest {

    InterestCalculator obj = new InterestCalculator();

    @Test
    public void testSimpleInterest() {
        assertEquals(1000, obj.simpleInterest(10000, 5, 2));
    }

    @Test
    public void testCompoundInterest() {
        assertEquals(2100, obj.compoundInterest(10000, 10, 2), 0.01);
    }

    @Test
    public void testSimpleAmount() {
        assertEquals(11000, obj.simpleAmount(10000, 5, 2));
    }

    @Test
    public void testCompoundAmount() {
        assertEquals(12100, obj.compoundAmount(10000, 10, 2), 0.01);
    }
}
