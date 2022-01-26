package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            var input = new Scanner(System.in);
            System.out.print("Welcome what do you want to do?");
            String s = input.nextLine();
            switch (s.charAt(0)) {
                case '1' -> {
                    System.out.println("Palindrom");
                    var scan = new Scanner(System.in);
                    System.out.print("Skriv en text? " );
                    String s2 = scan.nextLine();
                    if (com.company.StringMetoder.ärPalindrom(s2))
                        System.out.println("Palindrom");
                    else
                        System.out.println("Inte palindrom");

                }
                case '2' -> System.out.println("Man");
                case '?' -> System.out.println("type 1-2 to choose program :");
                default -> {
                    System.out.println("Invalid choice, E to exit");

                    if (s.equalsIgnoreCase("e")) {
                        isRunning = false;
                    }
                }

            }
        }
    }

    private static class StringMetoder {
    }
}

