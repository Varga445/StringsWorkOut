package com.strings;

import java.util.Formatter;
//cum putem folosii variabile pt a da valorii
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private final int W1=15;
    private final int W2=5;
    private final int W3=10;
    private String s1 = "%-" + W1 + "s %" + W2 + "s %" + W3 + "s\n";
    private String s2 = "%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n";
    private String s3 = "%-" + W1 + "s %" + W2 + "s %" + W3 + ".2f\n";
    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format(s2, name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format(s3, "Tax", "", total*0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "",
                total * 1.06);
    }
}
