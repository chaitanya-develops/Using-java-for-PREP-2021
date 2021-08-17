package com.company;

public class Main {

    public static void main(String[] args) {
//        int myValue = 10000;
        int myMinInteger = Integer.MIN_VALUE; 
        int myMaxInteger = Integer.MAX_VALUE;
        System.out.println("Maximum of integer is " + myMaxInteger);
        System.out.println("Minimum of Integer is " + myMinInteger);
        System.out.println("Busted max " + (myMaxInteger+1));
        System.out.println("Busted min value " + (myMinInteger-1));

    }
}
