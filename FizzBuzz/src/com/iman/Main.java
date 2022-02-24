package com.iman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        System.out.println("Enter a number for what you would like to do:\n 1- Print out 1-100\n 2- Enter a number and convert it");

        Scanner scanner = new Scanner(System.in);

        String option1 = scanner.nextLine().trim();

        if (option1.equals("1")) {
            for (int i = 1; i < 101; i++) {
                fizzBuzz(i);
            }
        }
        else if (option1.equals("2")) {
            System.out.println("Enter a number: ");
            int option2 = Integer.parseInt(scanner.nextLine().trim());
            fizzBuzz(option2);
        }
        else {
            run();
        }
        System.out.println("Would you like to do something else? (y/n)");
        String answer = scanner.nextLine().trim();
        if (answer.toLowerCase().equals("y")) {
            run();
        }
    }

    public static void fizzBuzz(int number) {
        if ((number % 3 == 0) && (number % 5 ==0)) {
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}
