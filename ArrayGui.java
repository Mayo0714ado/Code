package arraygui;

import javax.swing.JOptionPane;

public class ArrayGui {

    public static void main(String[] args) {
        login();
    }

    public static void login() {

        String[] username = {"One", "Two", "Three", "Four", "Five", "Six"};
        String[] password = {"One", "Two", "Three", "Four", "Five", "Six"};

        JOptionPane.showMessageDialog(null, "Welcome to Login Page!", "WELCOME!", 1);

        int attempt = 0;
        boolean loggedIn = false;
        while (attempt < 3 && !loggedIn) {

            String user = JOptionPane.showInputDialog(null, "Username:", "USERNAME", 3);
            String pass = JOptionPane.showInputDialog(null, "Password:", "PASSWORD", 3);

            for (int i = 0; i < username.length; i++) {
                if (user.equalsIgnoreCase(username[i]) && pass.equalsIgnoreCase(password[i])) {
                    JOptionPane.showMessageDialog(null, "Welcome " + username[i], "WELCOME!", 1);
                    loggedIn = true;
                    break;
                }
            }
            if (!loggedIn) {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password", "INVALID!", 0);
                attempt++;
            }
        }
        if (attempt == 3 && !loggedIn) {
            JOptionPane.showMessageDialog(null, "Maximum attempt Exceeded", "EXCEEDED ATTEMP!", 0);
        }
    }
}
