package com.assignment;

import java.util.Scanner;

public class Stringbuilder {

    public static void main(String[] args) {
        repeatCharacters();
    }

    public static void repeatCharacters() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                           CHARACTER REPEATER
                           This program will repeat the character in a string (n) number of times.
                           
                           Enter a string:""");

        String input = scanner.nextLine();

        System.out.print("Number of times: ");
        int repeats = scanner.nextInt();

        if (input.isEmpty() && repeats <= 0) {
            System.out.println("""
                               Invalid number of repetition
                               The input is empty or contains only whitespace.""");
        } else if (input.isEmpty()) {
            System.out.println("The input is empty or contains only whitespace.");
        } else if (repeats <= 0) {
            System.out.println("Invalid number of repetition");
        } else {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                for (int j = 0; j < repeats; j++) {
                    sb.append(currentChar);
                }
            }
            System.out.println("\nOriginal String: " + input);
            System.out.println("Repeated String: " + sb.toString());
        }

    }
}
