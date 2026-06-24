package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3), "2 + 3 harusnya 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(4, 3), "4 - 3 harusnya 1");
    }

    @Test
    public void testMultiply() {
        assertEquals(12, calc.multiply(4, 3), "4 * 3 harusnya 12");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calc.divide(6, 3), "6 / 3 harusnya 2.0");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(1, 0);
        });
        assertEquals("Pembagian dengan nol tidak diizinkan!", exception.getMessage());
      
        // Bismillah fix surefire bug
    }
}