package com.java.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println(sum);

    }
}
