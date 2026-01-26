package com.java.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={27,32,23,66,4,41};
        int target=66;
        int ans=linearsearch1(arr,target);
        System.out.println(ans);
    }
//    static int linearsearch(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int element=arr[i];
//            if(element==target){
//
//                return i;
//            }
//
//        }
//        return -1;
//    }
    static int linearsearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){

                return element;
            }

        }
        return -1;
    }
}
