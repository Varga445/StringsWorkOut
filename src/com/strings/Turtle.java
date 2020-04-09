package com.strings;

import java.util.Formatter;

public class Turtle {


    private int num=5;
    private long numl=2147483649L;
    private float numf=5.5f;
    private double numd=5.6;
    public  String toString(){
        return String.format("%5d%n %5d%n %5f%n %5f%n",num,numl,numf,numd);
    }

}
