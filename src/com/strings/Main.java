package com.strings;

public class Main {

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Fasole", 4, 2.5);
        receipt.printTotal();
        System.out.println("---------------------------------------------------");
        System.out.println();
        Format format = new Format();
        format.tableConversie();
        System.out.println("---------------------------------------------------");
        System.out.println();
        format.exercitiuFormat();
        System.out.println("----------------------------------------------------");
        System.out.println();
        Turtle t1 = new Turtle();
        System.out.println(t1.toString());
        System.out.println("----------------------------------------------------");
        System.out.println();
        RegulaExpresions.randomFakeMail();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        RegulaExpresions.metoda1();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        RegulaExpresions.extragere();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        RegulaExpresions.exercitiu();
        System.out.println("------------------------------------");


    }
}
