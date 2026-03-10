package com.java.oops.properties.polymorphism;

public class Circle extends Shapes{
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
