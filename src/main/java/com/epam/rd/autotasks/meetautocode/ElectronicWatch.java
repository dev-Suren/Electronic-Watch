package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        String newClock = (seconds >= 86400) ? first(seconds):seconds1(seconds);
        System.out.println(newClock);



    }
    public static String first(int seconds){
        int hours = 0;
        int minutes = (seconds % 86400) / 60;
        int sec = seconds % 60;
        return String.format("%2d:%02d:%02d",hours, minutes, sec);
    }
    public static String seconds1(int seconds){
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int sec = seconds % 60;
        return String.format("%2d:%02d:%02d",hours, minutes, sec);
    }
}
