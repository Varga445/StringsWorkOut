package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaExpresions {
    public static String poveste =
            "Amu cica era odată într-o ţară un crai, care... avea trei feciori.";


    public static void metoda1() {
        System.out.printf("%30s%n", "Original");
        System.out.println(poveste);
        System.out.printf("%30s%n", "Modificate");
        System.out.println(poveste.replaceFirst("c\\w+", "zice"));
        System.out.println(poveste.replaceAll("cica", "poate"));
        System.out.println(Arrays.toString(poveste.split(" ")));
        System.out.println(Arrays.toString(poveste.split("\\W+")));//elimnata ceea ce crede el ca nu is cuvinte in engleza
        //daca am folosit o propozitie cu caractere romanesti, nu o sa le ia, vezi varianta fara diacritice ro

    }

    public static void randomFakeMail() {
        String[] cuvinte = {"dove", "spade", "shazam", "pistachio", "katrina"};
        String gform = "@gmail.com";
        Random random = new Random();
        //int numar = random.nextInt(20);
        List<String> emails = new ArrayList<String>();
        for (String s : cuvinte) {
            emails.add(s + random.nextInt(20) + gform);
        }
        System.out.println("Random Fake Emails");
        System.out.println(emails);
    }


    public static void extragere() {
        System.out.println("Identificare Pattern");
        String text = "dove5@gmail.com"; //"dove5@gmail.com"
        String re = "\\w\\w\\w\\w\\d\\W\\w\\w\\w\\w\\w\\W\\w\\w\\w";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(text);
        boolean result = matcher.matches();

        System.out.println(result);
        if (result) {//
            System.out.println(matcher);
        }


    }


    public static void exercitiu() {
        //"^\\p{Lu}"; //asta verifica da prima litera din line ii CAPITAL
        String prop = "Casa ii mare.";
        String re1 = "^\\p{Lu}";
        String re2 = "\\W";

        char first = prop.charAt(0);
        String firstOfprop = Character.toString(first);

        Pattern pattern1 = Pattern.compile(re1);
        Matcher matcher1 = pattern1.matcher(firstOfprop);
        boolean result1 = matcher1.matches();
        //System.out.println(result1);
        if (result1) {
            System.out.println(result1);
            System.out.println("Prima litera din propozitie este cu LITERA MARE");
        } else {
            System.out.println(result1);
            System.out.println("Propozitia incepe cu " + firstOfprop);
        }


        char last = prop.charAt(prop.length() - 1);//imi extrage ultimul char
        String lastOFprop = Character.toString(last);

        if (lastOFprop.equals(".")) {
            Pattern pattern2 = Pattern.compile(re2);
            Matcher matcher2 = pattern2.matcher(lastOFprop);
            boolean result2 = matcher2.matches();
            System.out.println(result2);
            System.out.println("Propozitia se termina cu  \'.\'");
        } else {
            System.out.println(false);
            System.out.println("Propozitia se termina cu " + lastOFprop);

        }

    }

}


