package com.java.basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("enter a number");
        number=sc.nextInt();
        int a=0;
        int b=1;
        int count = 2;
        while (count <= number){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
