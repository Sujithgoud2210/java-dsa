package com.java.linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String s = "sujith";
        char target = 's';
        System.out.println(search(s, target));
    }

    static boolean search(String s, char target) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (target == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
