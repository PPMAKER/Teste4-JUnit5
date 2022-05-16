package com.mycompany.introjunit5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MathUtil {

    private MathUtil(){}
    
    /**
     * Calcula o MDC de dois números.
     * @param a
     * @param b
     * @return 
     */
 public static int mdc(int a, int b) {
        // Propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);

        // Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //Propriedade 1
        if (b > 0 && a % b == 0) {
            return b;
        }

        //Propriedade 3
        if (b == 0) {
            return Math.abs(a);
        }

        return mdc(a - b, b);
    }

    public static int mdc(int... valores) {
        Objects.requireNonNull(valores, "!!!! PARAMÊTRO NÃO PODE SER NULO !!!!");

        if (valores.length == 0) {
            throw new IllegalArgumentException("!!!! VALOR PRECISA SER INDICADO !!!!");
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
}