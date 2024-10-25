package com.stjean.TPTESTU1_YoumbiYvan;

import java.util.Arrays;

public class OperationMathematique {
    public boolean estPositif(int nombre) {
        return nombre > 0;
    }
    public int factorial(int nombre) {
        if (nombre < 0) throw new IllegalArgumentException("Negative number");
        int fact = 1;
        for (int i = 1; i <= nombre; i++) {
            fact *= i;
        }
        return fact;
    }

    public int[] sort(int[] lists) {
        Arrays.sort(lists);
        int[] sorted = new int[lists.length];
        for (int i = 0; i < lists.length; i++) {
            sorted[i] = lists[lists.length - i - 1];
        }
        return sorted;
    }
}

