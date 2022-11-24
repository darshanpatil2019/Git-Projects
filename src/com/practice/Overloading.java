package com.practice;

public class Overloading {
    void show(int a, String b)
    {
        System.out.println("Hello");
    }
    void show(int a) // same method , different arguments
    {
        System.out.println("Namaste");
    }

    public static void main(String[] args) {
        Overloading O = new Overloading(); //create object
        O.show(10,"Darshan");
    }
}
