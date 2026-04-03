package com.java.oops.staticexample;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human(22, "sujith", 10000, false);
//        Human human1 = new Human(32, "sujith1", 11000, true);
//        Human human2 = new Human(24, "sujith2", 15000, false);
//        System.out.println(human1);
        System.out.println(Human.population);
        greet();
        Main obj=new Main();
        obj.greet(); 
    }
    static void greet(){
        System.out.println("hello");

    }
    void greet(String msg){
        System.out.println("greeting");
        greet();
    }
}
