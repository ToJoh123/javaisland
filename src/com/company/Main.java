package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean isRunning = true;

        while (isRunning) {
            var input = new Scanner(System.in);
            System.out.print("Welcome what do you want to do?");
            String s = input.nextLine();
            switch (s.charAt(0)) {
                case '1' -> {
                    System.out.println("Palindrome");
                    var scan = new Scanner(System.in);
                    System.out.print("Write a text? ");
                    String s2 = scan.nextLine();
                    if (com.company.StringMetoder.isPalindrom(s2))
                        System.out.println("Palindrome");
                    else
                        System.out.println("not palindrome");

                }
                case '2' -> {
                    System.out.println("Read comments from file");
                    Comments comments = new Comments();
                    comments.getComments();
                }
                case '3' -> {
                    System.out.println("Temperatures");
                    AverageTemp averageTemp = new AverageTemp();
                    averageTemp.getTemp();
                }
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
}

