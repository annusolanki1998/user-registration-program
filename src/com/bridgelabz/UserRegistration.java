package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));

        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));

        System.out.println("Enter emailId");
        String emailId = scanner.next();
        System.out.println(Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,}", emailId));

        System.out.println("Enter mobile number");
        String mobileNumber = scanner.next();
        System.out.println(Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber));

        System.out.println("Enter Password");
        String Password1 = scanner.next();
        System.out.println(Pattern.matches("[a-z A-Z]{8,}", Password1));

        System.out.println("Enter Password should have at least one upper case letter");
        String Password2 = scanner.next();
        System.out.println(Pattern.matches("(?=.*?[A-Z])[a-z A-Z]{8,}", Password2));

        System.out.println("Enter Password should have at least one numeric number in the password");
        String Password3 = scanner.next();
        System.out.println(Pattern.matches("(?=.*?[A-Z])[a-z A-Z 0-9]{8,}", Password3));

        System.out.println("Enter Password has exactly one special character");
        String Password4 = scanner.next();
        System.out.println(Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}", Password4));


    }

}
