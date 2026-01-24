package com.java.basics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int number;
        int remainder, reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        number = sc.nextInt();
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
