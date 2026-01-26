package com.java.arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of array");
        n=sc.nextInt();
        int[] arr=new int[n];
        int start,end;
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        start=0;
        end=arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        sc.close();
    }
}
