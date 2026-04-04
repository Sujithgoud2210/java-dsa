package com.java.oops.singleton;

import java.util.Stack;

public class Singleton {
   private int num=0;
   private Singleton(){

    }
    public static Singleton instance;
   public static Singleton getInstance(){
       if(instance==null){
           instance=new Singleton();
       }
       return instance;
   }
}
