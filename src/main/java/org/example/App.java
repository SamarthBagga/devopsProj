package org.example;

import java.util.Scanner;

public class App {

    // Method to greet a user with their name
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    // Method to return a default greeting
    public String getDefaultGreeting() {
        return "Hello, World!";
    }

    // Main method to run the application
    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        // Asking for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Output the greeting
        System.out.println(app.greet(name));

        // Optionally print the default greeting
        System.out.println(app.getDefaultGreeting());

        scanner.close();
    }
}
