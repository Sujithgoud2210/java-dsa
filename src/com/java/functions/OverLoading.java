package com.java.functions;

public class OverLoading {
    public static void main(String[] args) {
        fun(10);
        fun("sujith");
        int ans=sum(10,20,30);
        int ans1=sum(10,20);
        System.out.println(ans);
        System.out.println(ans1);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
