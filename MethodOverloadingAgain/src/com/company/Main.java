package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    private static String getDurationString(int min, int sec){
        if (min<0 || sec < 0 || sec>59){
            return "Invalid Parameters";
        }
        int xx = min /60;
        int yy = min %60;
        return xx+"h " + yy + "m " + sec + "s";
    }

    private static String getDurationString(int sec){
        if (sec<0){
            return "Invalid Value.";
        }
        int min = sec/60;
        int remainingSec = sec%60;
//        System.out.println(min+"m "+remainingSec + "s");
        return getDurationString(min,remainingSec);
    }
}
