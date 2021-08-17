package com.company;

public class Main {

    public static void main(String[] args) {
        byte var1 = 2;
        short var2 = 300;
        int var3 = 70_000;
        long var4 = 50_000 + (10 * (var1 + var2 + var3));
        System.out.println(var4);
    }
}
