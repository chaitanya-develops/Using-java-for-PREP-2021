package com.company;

public class Main {

    public static void main(String[] args) {
	    char switchValue = 'B';
	    switch (switchValue){
            case 'A':
                System.out.println("It was an A");
                break;
            case 'B':
                System.out.println("It was a B");
                break;
            case 'C':
                System.out.println("It was a C");
                break;
            default:
                System.out.println("It was neither an A or B or C");
                break;
        }
    }
}
