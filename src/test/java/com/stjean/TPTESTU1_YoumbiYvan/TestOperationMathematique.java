package com.stjean.TPTESTU1_YoumbiYvan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class TestOperationMathematique {

    @Test
    public void testEstPositif() {
        OperationMathematique operation = new OperationMathematique();
        assertTrue(operation.estPositif(5), "5 is positive");
        assertFalse(operation.estPositif(-3), "-3 is negative");
        assertFalse(operation.estPositif(0), "0 is not positive");
    }

    @Test
    public void testFactorial() {
        OperationMathematique operation = new OperationMathematique();
        assertEquals(1, operation.factorial(0), "Factorial of 0 should be 1");
        assertEquals(1, operation.factorial(1), "Factorial of 1 should be 1");
        assertEquals(120, operation.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorialNegativeException() {
        OperationMathematique operation = new OperationMathematique();
        assertThrows(IllegalParamISIException.class, () -> {
            operation.factorial(-1);
        }, "Factorial of a negative number should throw IllegalParamISIException");
    }

    @Test
    public void testSort() {
        OperationMathematique operation = new OperationMathematique();
        int[] unsorted = {3, 1, 4, 1, 5, 9};
        int[] sorted = {9, 5, 4, 3, 1, 1};
        assertArrayEquals(sorted, operation.sort(unsorted), "Array should be sorted in descending order");
    }

}