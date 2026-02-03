package com.java.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println(arr.toString());
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("enter target element");

        int target;
        target=sc.nextInt();
        int ans=binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
}
