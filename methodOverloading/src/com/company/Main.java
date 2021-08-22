package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("100 inches is : ");
        System.out.println(calcFeetAndInchesToCentimeters(100)+ " centimeters.");
	// write your code here

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet<0 || inches<0 || inches>12){
            return -1;
        }

        return (feet*12 + inches)*2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0) {
            return -1;
        }
        double feet = (int)(inches/12);
        double remainingInches = (int)(inches%12);
        System.out.println(feet + "feet, "+ remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

    }
}
