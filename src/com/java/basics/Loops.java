package com.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
//        System.out.println("enter a number");
//        number = sc.nextInt();
//        for (int i = 1; i <= number; i++) {
//            System.out.println(i);
//            }
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
