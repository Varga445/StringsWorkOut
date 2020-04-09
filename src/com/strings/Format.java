package com.strings;

import java.util.Formatter;

public class Format {


   private Formatter formatter = new Formatter(System.out);

    public void tableConversie() {
        formatter.format("%30s%n %35s%n ", "Conversion Characters", "-----------------------------");
        formatter.format("%12s %20s%n", "d  - ", "Integral(as decimal)");
        formatter.format("%12s %20s%n", "c  -", "Unicode Character");
        formatter.format("%12s %20s%n", "b  -", "Boolean value");
        formatter.format("%12s %20s%n", "s  -", "String");
        formatter.format("%12s %20s%n", "f  -", "Floating point(as decimal)");
        formatter.format("%12s %21s%n", "x  -", "Integral(as hex)");
        formatter.format("%12s %21s%n", "h  -", "Hash code(as hex)");
        formatter.format("%12s %21s%n", "%  -", "Literal \"%\"");


    }

    public void exercitiuFormat() {
        char[] abc = {'A', 'B', 'C'};
        int[] nume = {1, 2, 3};
        String total = "Total";
        String caz = "Caz: ";


        formatter.format("%28s%n", "Calcul");

        formatter.format("%16s %s %1c %s %2d %1s %1d %5s %1d%n",caz,"|", abc[0],"|", nume[0], "+", nume[1], total + " =", nume[0] + nume[1]);
    }
}

