package com.java.linearsearch;

public class MinValue {
    public static void main(String[] args) {
        int[] arr={27,32,23,66,4,41};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
