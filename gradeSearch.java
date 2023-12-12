package studentGrade;

import javax.swing.JOptionPane;

public class gradeSearch {

    private static String[] studentNames = new String[50];
    private static int[] grades = new int[50];
    private static int currentIndex = 0;

    public static void main(String[] args) {
        boolean running = true;

        while (running) {

            String choice = JOptionPane.showInputDialog("Enter:\n1 - Input Grades\n2 - Look up Student Grade\n3 - Exit");

            switch (choice) {
                case "1": {
                    inputGrade();
                }
                break;
                case "2": {
                    lookUpGrade();
                }
                break;

                case "3":
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void inputGrade() {
        String name = JOptionPane.showInputDialog("Enter Student Name:");

        if (name != null && !name.isEmpty()) {
            boolean found = false;
            for (int i = 0; i < currentIndex; i++) {
                if (name.equalsIgnoreCase(studentNames[i])) {
                    found = true;
                    JOptionPane.showMessageDialog(null, "There's already a student named ." + studentNames[i], "Null", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
                if (!found){
                    int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter grade for " + name + ":"));

                    studentNames[currentIndex] = name;
                    grades[currentIndex] = grade;
                    currentIndex++;
                }

            

        } else {
            JOptionPane.showMessageDialog(null, "Student name cannot be empty or null.", "Null", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void lookUpGrade() {
        String search = JOptionPane.showInputDialog(null, "Look up Student Grade", "Search", 1);
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (search != null && studentNames[i].equalsIgnoreCase(search)) {
                JOptionPane.showMessageDialog(null, studentNames[i] + "'s grade is: " + grades[i], studentNames[i], JOptionPane.INFORMATION_MESSAGE);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Student not found", "Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }
}
