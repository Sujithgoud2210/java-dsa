package com.java.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={27,32,23,66,4,41};
        int target=66;
        int start;
        int end;
        int ans=linearsearch(arr,target,1,3);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){

                return i;
            }

        }
        return -1;
    }
}
