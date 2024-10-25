package com.stjean.TPTESTU1_YoumbiYvan;

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
}

