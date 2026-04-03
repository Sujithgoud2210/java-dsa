package com.java.oops.staticexample;

public class StaticInt {
    static int a=4;
    static int b;
static {
    System.out.println("im in static block");
    b=a*5;
}

    public static void main(String[] args) {
        StaticInt obj =new StaticInt();
    }
}
