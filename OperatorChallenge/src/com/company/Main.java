package com.company;

public class Main {

    public static void main(String[] args) {
	    double FirstDouble = 20.00d;
	    double SecondDouble = 80.00d;
	    double Sum = 100.00d * (FirstDouble + SecondDouble);
	    double Remainder = Sum % 40;
		System.out.println(Remainder);
	    boolean Truth;
        Truth = Remainder == 0;
        System.out.println(Truth);
        if (!Truth)
        	System.out.println("Got some remainder");

    }
}
