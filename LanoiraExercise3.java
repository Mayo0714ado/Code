/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryzen
 */
public class LanoiraExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        random();
    }
    
    public static void random() {
        String[] random = {"eno", "wot", "eethr", "rofu", "fiev", "sxi"};
        String[] answer = {"one", "two", "three", "four", "five", "six"};
        int correct = 0, incorrect = 0;
        
        for (int i = 0; i < random.length; i++) {
            String yourans = JOptionPane.showInputDialog("Guess the word: \n" + random[i]);
            if (answer[i].equalsIgnoreCase(yourans)) {
                correct++;
            }
            else {
                incorrect++;
            }
            if (incorrect == 3) {
                JOptionPane.showMessageDialog(null, "Game over! You have reached 3 incorrect answers already");
                break;
            }
        }
        if (correct == random.length) {
            JOptionPane.showMessageDialog(null, "Congratulations, you answered all questions correctly.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Great Job! You've answered " + correct + " questions correctly.");
        }
    }
    
}
