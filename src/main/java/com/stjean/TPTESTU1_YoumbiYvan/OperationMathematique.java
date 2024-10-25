package com.stjean.TPTESTU1_YoumbiYvan;

import java.util.Arrays;

public class OperationMathematique {
    public boolean estPositif(int nombre) {
        return nombre > 0;
    }

    public int factorial(int nombre) throws IllegalParamISIException {
        if (nombre < 0) throw new IllegalParamISIException("Negative number");
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

    public double maxNumba(double[] values) {
        double max = Double.NEGATIVE_INFINITY;
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

}

