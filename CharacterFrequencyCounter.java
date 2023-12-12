/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;

import javax.swing.JOptionPane;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog("Enter a sentence:");

        // Remove spaces and convert the sentence to lowercase for uniformity
        sentence = sentence.replaceAll("\\s", "").toLowerCase();

        // Create an array to store characters and their frequencies
        char[] characters = new char[sentence.length()];
        int[] frequency = new int[sentence.length()];

        // Initialize arrays to default values
        for (int i = 0; i < sentence.length(); i++) {
            characters[i] = '\u0000'; // Default value for a char array
            frequency[i] = 0;
        }

        // Calculate character frequency
        int uniqueChars = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            int index = -1;

            // Check if the character is already in the array
            for (int j = 0; j < uniqueChars; j++) {
                if (characters[j] == currentChar) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                characters[uniqueChars] = currentChar;
                frequency[uniqueChars]++;
                uniqueChars++;
            } else {
                frequency[index]++;
            }
        }

        // Create StringBuilder to build the output message
        StringBuilder output = new StringBuilder("Character frequencies:\n");

        // Append each character and its frequency to the output
        for (int i = 0; i < uniqueChars; i++) {
            output.append("'").append(characters[i]).append("': ").append(frequency[i]).append("\n");
        }

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, output.toString());
    }
}

