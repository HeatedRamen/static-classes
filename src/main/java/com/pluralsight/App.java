package com.pluralsight;

public class App {
    public static void main(String[] args) {

        println(NameFormatter.format("Dr. Mel B Johnson, PhD"));
        println(NameFormatter.format("Mel B Johnson, PhD"));
        println(NameFormatter.format("Mel Johnson"));
    }

    public static void println(String message){ System.out.println(message);}
}
