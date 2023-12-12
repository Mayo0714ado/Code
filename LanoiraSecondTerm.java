
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.main;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryzen
 */
public class LanoiraSecondTerm {

    static Scanner rolaina = new Scanner(System.in);
    //allows you to not bother creating new scanners throughout your projects.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        notes();
        /* LOOP RECAP:
         * Indefinite loop - loop controlled by the user, event-controlled loop, final number of loops is unknown.
         * Definite loop - count-controlled loop, executes a specific number of times.
         * Pretest loop - loop control variable is tested before the loop body executes.
         * Posttest loop - loop control variable is tested after the loop body executes.
         * Loop - structure that allows repeated execution of a block of statements.
         * Loop body - block of statements that executes when the Boolean expression that controls the loop is true.
         * Iteration - one loop execution.
         * While loop - executes a body of statements continually as long as the Boolean expression that controls entry into the loop continues to be true.
         * Loop control variable - variable whose value determines whether loop execution continues.
         * Infinite loop - loop that never ends.
         * Empty body - block with no statements in it.
         * Incrementing a variable adds 1 to its value.
         * Decrementing a variable reduces its value by 1
         */
    }

    public static void printf() {
        /* Character and String Class (Must Remember!)
         * Character — A class whose instances can hold a single character value. (Keyword: SINGLE CHARACTER)
         * String — A class for working with fixed-string data — that is, unchanging data composed of multiple characters. (Keyword: MULTIPLE CHARACTER)
         * StringBuilder — Classes for storing and manipulating changeable data composed of multiple characters. (Keyword: STORING AND MANIPULATING DATA)
         */
        
    /* printf functions
     * %n - newline , Platform specific newline character
     * %s - String format specifier
     * %S - String format in UPPERCASE
     * %c - Character format specifier
     * %C - Character format in UPPERCASE
     * %d - integer value (decimal value)
     * %f - floating point numbers (numbers w/ decimal point) (has a default of
            6 decimal places)
     * %.0f%n , %.0f, - floating point precision and equality (# of decimal)
     * %02d - zero padding for numbers (# of spaces)
     * %, - comma grouping separator for numbers >1000
     * %,d integer value with comma separator
     * %,.02f - floating point number with comma separator
     * Make sure to have the same number of conversion character and variable
       (parameter)
     * You can use any mix of data with different datatype in one statement
     */
        String firstname = "Lanoire", secondname = "Ianel";
        char gender = 'F';
        int age = 17;
        double fibo = 1.61803;
        long num = 300_000_000;
        System.out.printf("Hi! My name is %s %s! %nMy gender is %c and my age is %d.%n", firstname, secondname, gender, age);
        System.out.printf("The Fibonacci ratio is %f, or %.2f, and a big number is %,d.%n", fibo, fibo, num); //here see difference of %f and %.0f.

    }

    public static void classmethods() {
        /* Java Character Class (Must Remember!)
         * Character class - contains standard methods for testing the values of characters.
        */
        /* Character class methods:
        * isUpperCase() - Tests if character is uppercase
        * toUpperCase() - Returns the uppercase equivalent of the argument
        * isLowerCase() - Tests if character is lowercase
        * toLowerCase() - Returns the lowercase equivalent of the argument;
        * isDigit() - Returns true if the argument is a digit (0−9) and false otherwise
        * isLetter() - Returns true if the argument is a letter and false otherwise
        * isLetterOrDigit() - Returns true if the argument is a letter or digit and false otherwise
        * isWhitespace() - Returns true if the argument is whitespace and false otherwise, all blank space
         */
        char letter;
        do {
            System.out.print("Type a letter or digit: ");
            letter = rolaina.next().charAt(0);
            if (Character.isLetter(letter)) {
                System.out.println("It is a Letter!");
                if (Character.isUpperCase(letter)) {
                    System.out.println("The letter is in UPPERCASE.");
                    System.out.printf("Converting to lowercase: %c%n", (Character.toLowerCase(letter)));
                } else if (Character.isLowerCase(letter)) {
                    System.out.println("The letter is in lowercase.");
                    System.out.printf("Converting to uppercase: %c%n", (Character.toUpperCase(letter)));
                }
            } else if (Character.isDigit(letter)) {
                System.out.println("It is a Digit!");
            }
        } while (Character.isLetterOrDigit(letter));
        System.out.println("That is not a letter or digit.");
    }

    public static void stringclass() {
        /* Other String Class
        * .charAt() - requires an integer argument that indicates the position of the character that the method returns.
        * .equals()
        * .equalsIgnoreCase()
        * .contains() - true if it contains that value.
        * .toUpperCase()
        * .toLowerCase()
        * .startsWith() - true if string starts with.
        * .endsWith() - true if string ends with.
        * .length() - returns the length of a String.
        * .replace(oldChar, newChar) - replace all occurrences of some character within a String.
        * .replace(target, replacement)
        * .substring() - takes two integer arguments—a start position and an end position
        * .indexOf() - determines whether a specific character occurs within a String.
         */
        String pin;
        boolean valid = false;
        do {
            System.out.println("Enter your pin: ");
            pin = rolaina.next();
            if (pin.length() >= 8 && pin.length() <= 20) {
                System.out.println("Successfully set your pin.");
                valid = true;
                System.out.println("Enter a word that starts with letter 'R'");
                while (true) {
                    System.out.print("> ");
                    String word = rolaina.next().toUpperCase();
                    if (word.startsWith("R")) {
                        System.out.println("That's correct!");
                        String newword = word.toLowerCase().
                            replace('e','a');
                        System.out.printf("That sounds like %s.%n",newword);
                    } else {
                        System.out.printf("The word starts with %C and not R%n", word.charAt(0));
                        break;
                    }
                }
            } else {
                System.out.println("Invalid pin length. Try again");
            }
        } while (!valid);//while the pin is invalid or not valid
    }
    
    public static void StringBuilder() {
        /* More Strings:
         * .concat() - concatenation
         * .format()- format string
         * .indexOf() - returns index of specified char/character
         * Double.parseDouble() - string to Double
         * Integer.parseInt() - string to Integer
         * .toString() - convert to string
        */
        System.out.println("--More Strings example--");
        double pi = 3.141;
        String str1 = "Lanoire", str2 = "Hi, I am ", str3 = "The value of pi is " + String.format("%.2f", pi);
        int count = str2.indexOf("i");
        
        
        System.out.println(str2.concat(str1) + "\n" + str3);
        System.out.println("The number of 'i' is: " + count);
        
        /* StringBuilder
         * .append() = concatenate
         * .delete(start,end) = delete character seq
         * .insert() = insert character
         * .reverse() = causes the character sequence to be replaced by the reverse of the sequence.
        */
        StringBuilder lanoire = new StringBuilder();
        System.out.println("--Example for StringBuilder--");
        while(true){
            System.out.print("Enter a word to a list: ");
            String input = rolaina.next();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            else{
                lanoire.append(input).append(", ");
                lanoire.delete(0,1);
                lanoire.insert(0, "-");
            }
        }
        System.out.println("Your list: " + lanoire.toString());
    }
    
    public static void Arrays() {
        /* Arrays (Must Remember!)
         * Array - special kind of object used to store a collection of SAME TYPE OF DATA.
         * An array object has only a small number of predefined methods.
         * Syntax: Base_Type name = new Base_Type[length/size]
         * length limit is 100;
         * Valid index = 0 to length-1 or n-1
         * length - returns the number of elements in an array
         * Alternate Syntax: Base_Type[] name = {e1, e2, e3, ...}
        
         * To initialize an array, use a list of values **enclosed in curly braces, separated by commas.**
         * Populating an array during creation means **providing values without explicitly specifying the size.**
         * Java allocates memory for an array and other objects during execution.
        */
        
        //The Example below is the representation of the given problem at Machine Problem #2.
        System.out.println("Archon List");
        String[] archons = {"Lord Barbatos", "Rex Lapis", "Raiden Shogun", "Lesser Lord Kusanali", "Lord of Amrita", "Murata", "The Tsaritsa"};
        System.out.print("Search an Archon: ");
        String search = rolaina.next();
        boolean isFound = false;
        for (int q = 0; q < search.length(); q++) {
            if (archons[q].equalsIgnoreCase(search)) {
                System.out.printf("Yes, there is %s in the list.%n", archons[q]);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.printf("The name %s is not in the list. Here is the list: %n", search);
            for (int i = 0; i < archons.length; i++) {
                System.out.println(archons[i]);
            }
        }
        /* Errors in array:
         * ArrayIndexOutOfBounds - if the array index you try to show exceeds the number of indices indicated.
         * NegativeArraySizeException - when the array index you try to show is negative.
        */
    }
    
    public static void linearsearch() {
        /*
         * Precondition: Linear search works on both sorted and unsorted data. It doesn't require any specific order of data, making it more versatile.
         * Time Complexity: O(n) in the worst case. Linear search involves checking each element one by one until the target is found or the end of the list is reached.
         * Efficiency: Linear search is simple and easy to implement. It is efficient for small datasets or when the data is frequently changing.
         * Space Complexity: O(1) for both iterative and recursive implementations.
        */
        //one direction searching (right)
        int[] numbers = {1,2,3,5,6,7};
        System.out.print("Search Number: ");
        int target = rolaina.nextInt();
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                System.out.printf("Number found at index: %d%n", i);
            }
        }
        //if the value of index did not change, that means the value is not found.
        if (index == -1) {
            System.out.println("Number not found.");
        }
    }
    
    public static void binarysearch() {
        //two direction searching (left or right), works with sorted data
        /*
         * Precondition: Binary search works on sorted data.
         * Time Complexity: O(log n) in the worst case. Binary search reduces the search space by half at each step, making it significantly faster than linear search for large datasets.
         * Efficiency: Binary search is more efficient than linear search, especially for large datasets or infrequent change of data.
         * Space Complexity: O(1) for iterative binary search, O(log n) for recursive binary search.
        */
        int[] numbers = {1,2,3,5,6,7,10};
        System.out.print("Search Number: ");
        int target = rolaina.nextInt();
        int left = 0; //first index
        int right = numbers.length -1; //last index
        int mid;
        while (left <= right){
            mid = ((left + right)/2);
            if (numbers[mid] > target) {
                right = mid + 1;
            }
            else if (numbers[mid] < target){
                left = mid - 1;
            }
            else {
                System.out.printf("Element found at index: %d%n", mid);
                return;
            }
        }
        
        /*DIFFERENCE BETWEEN RETURN AND BREAK:
         * return - used to provide the result of the method execution back to the calling code. (Remember: return = exit method)
         * break - stops the loop/switch then continues the code. (Remember: break = exit loop/switch)
        */
    }
    
    public static void foreach() {
        /* Simplify the process of iteration arrays and collections
         * Syntax = for(Data_type name: array_name){}
        */
        String harbingers[] =  {"Pierro", "Il Dottore", "Columbina", "Arlecchino", "Pulcinella", "Sandrone", "Pantalone", "Tartaglia", "Il Capitano"};
        System.out.println("List of Harbingers");
        System.out.print("Search: ");
        String search = rolaina.nextLine();
        boolean found = false;
        /* "For each number in an Array of Data_type named array_name"
         * Shortcut = fore + tab
        */
        for (String harbinger : harbingers) {
            if (harbinger.equalsIgnoreCase(search)) {
                found = true;
            }
        }
        //(condition) ? gagawinIfTrue : gagawinIfFalse;
        System.out.println((found) ? "Yes, that is on the list" : "No, that is not included on the list.");
    }
    
    public static void ParallelArray() {
        /*Parallel array - using multiple arrays that are related by their indices. 
                         - accessing related information using the same subscript for both arrays.
        */
        String[] regions = {"Mondstadt", "Liyue", "Inazuma", "Sumeru", "Fontaine", "Natlan", "Snezhnaya"};
        String[] archons = {"Lord Barbatos", "Rex Lapis", "Raiden Shogun", "Lesser Lord Kusanali", "Focalors", "Murata", "The Tsaritsa"};
        int i;
        //Printing parallel array:
        for (i = 0; i < regions.length; i++) {
            System.out.printf("Region: %s%n", regions[i]);
            System.out.printf("Archon: %s%n%n", archons[i]);
        }
        
        System.out.print("Search the region: ");
        String search = rolaina.nextLine();
        boolean found = false;
        for (i = 0; i < regions.length; i++) {
            if (regions[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }
        System.out.println((found) ? ("The archon of the region " + regions[i] + " is " + archons[i] + ".") : (search + " is not found on the list."));
    }
    
    public static void JOptionPaneIntro() {
        /* JOptionPane - provides a set of methods for displaying dialog boxes or message boxes to interact with
         *   the user in graphical user interface (GUI) applications.
         * Four Types: Message, Confiramtion, Input, Dialog
         * DO NOT FORGET: Import for JOptionPane: import javax.swing.JOptionPane
        */
        // Message Dialogs = display message dialogs to provide information or notify the user.
        JOptionPane.showMessageDialog(null, "Good Morning! This is an example of a Message Dialog.");
        
        // Input Dialogs = allow you to prompt the user for input. (String to put user input)
        String name = JOptionPane.showInputDialog("This is an example of an Input Dialog. So, what is your name?");
        String result = "Hello, nice to meet you, " + name + "!";
        JOptionPane.showMessageDialog(null, result);
        
        /* Confirmation Dialogs = used to ask the user for confirmation or choice. (int for the yes/no/cancel etc buttons.(Whereas the choice "yes"
         *   corresponds to int 0, "no" to 1, "cancel" to 2.
        */
        // Yes, No, Cancel
        JOptionPane.showConfirmDialog(null, "This is an example of a Confirmation Dialog. Are you ready for the next question?");
        //Syntax for the Confirm Dialog: (message, title, option type[(yes), (yes,no), (yes,no,cancel)])
        int choice = JOptionPane.showConfirmDialog(null, "Do you love?", "The Question", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "Then I'm pretty sure it loves you too.");
        }
        
        // Option Dialogs = provide a customizable set of options for the user to choose from. (int for the option / array number.
        String[] options = {"Anemo", "Geo", "Electro", "Dendro", "Hydro", "Pyro", "Cryo"};
        int opt = JOptionPane.showOptionDialog(null, "Now, this is an example of an Option Dialog. Choose your element.", "Vision", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch(opt){
            case 0 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Anemo. Take my blessings and live leisurely from this day onward.");
            case 1 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Geo. This is the trust I have placed in them. Betray it, and you taint my blood.");
            case 2 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Electro. It once promised its people a dream: the never-changing 'eternity.'");
            case 3 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Dendro. Life has always been the end, while it is wisdom that shall be the means.");
            case 4 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Hydro. Only laws and the Tribunal can judge someone.");
            case 5 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Pyro. A pilgrimage for a wish; a battle to earn a name...");
            case 6 -> JOptionPane.showMessageDialog(null, "Well then, you now wield the power of Cryo. Since you could endure my bitter cold, you must have the desire to burn?");
        }
        /* QUICK GUIDE FOR MESSAGE TYPES:
         * INFORMATION_MESSAGE - shows a circle with "!" sign.
         * QUESTION_MESSAGE - shows a square with a "?" sign.
         * ERROR_MESSAGE - shows a piattos-like shape with a "x" sign.
         * WARNING_MESSAGE - shows a triangle with a "!" sign.
        */
    }
    
    public static void JOptionPaneApplication() {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Teyvat Fruits Inventory! \nHow many fruits do you want to put in the list?"));
        //Declaration of parallel arrays, [size] since it is you who will give the size.
        String[] fruits = new String [size];
        String[] colors = new String [size];
        
        //Populate the arrays
        for (int i = 0; i < size; i++) {
            fruits[i] = JOptionPane.showInputDialog("Fruit #" + (i+1) + "\nFruit Name");
            colors[i] = JOptionPane.showInputDialog("Fruit #" + (i+1) + "\nFruit Color:");
        }
        
        JOptionPane.showMessageDialog(null, "Successfully saved all the fruits.");
        
        //Search fruit depending on color
        boolean found = false;
        String search = JOptionPane.showInputDialog("SEARCH FRUIT BY COLOR:");
        for (int i = 0; i < size; i++) {
            if (colors[i].equalsIgnoreCase(search)) {
                JOptionPane.showMessageDialog(null, "The Fruit of that color is " + (fruits[i]));
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "The fruit color " + search + "is not found on the list you made.");
        }
    }
    
    public static void notes() {
        /* Words that are indicated by *text* means it is the keyword/sentence.
         * An array in Java is a named list of *data items of the same type*, declared by adding *square brackets* after the type.
         * Memory space for an array is *reserved using the keyword 'new'*.
         * Elements in an array are accessed using *subscripts or indices within square brackets*, starting from zero in Java.
         * Default values for numeric array elements are 0, char elements are '\u0000', boolean elements are false, and String elements are null.
         * Initialization of an array with non-default values is done using a list *enclosed in curly braces and separated by commas*.
         * Utilizing a variable as a subscript can *streamline array-based tasks*.
         * Loops often iterate from 0 to one less than the array size when working with arrays in applications.
         * Searching for a value in an array involves *looping through and making comparisons*.
         * Parallel arrays, with the same number of elements, can be used to *hold related information in corresponding positions*.
         ** All notes in the other methods are useful in the exam too. Make sure to read it as well!
        */
        JOptionPane.showMessageDialog(null, "You all have the talent, knowledge, and dedication to achieve all of your goals. \nThank You and Goodluck! <3");
    }
}
