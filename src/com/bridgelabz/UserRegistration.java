package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.lang.Thread;

public class UserRegistration {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to user registration program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));

        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));

        System.out.println("Enter emailId");
        String emailId = scanner.nextLine();
        System.out.println(Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,}", emailId));

        System.out.println("Enter mobile number");
        String mobileNumber = scanner.nextLine();
        System.out.println(Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber));

        System.out.println("Enter Password");
        String Password1 = scanner.nextLine();
        System.out.println(Pattern.matches("[a-z A-Z]{8,}", Password1));

        System.out.println("Enter Password should have at least one upper case letter");
        String Password2 = scanner.nextLine();
        System.out.println(Pattern.matches("(?=.*?[A-Z])[a-z A-Z]{8,}", Password2));

        System.out.println("Enter Password should have at least one numeric number in the password");
        String Password3 = scanner.nextLine();
        System.out.println(Pattern.matches("(?=.*?[A-Z])[a-z A-Z 0-9]{8,}", Password3));

        System.out.println("Enter Password has exactly one special character");
        String Password4 = scanner.nextLine();
        System.out.println(Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}", Password4));

        Thread.sleep(5000);

        System.out.println(" ");

        System.out.println("All the valid emails samples is as follows : ");
        System.out.println("");

        boolean emailSample1 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{3,}", "abc@yahoo.com"); //true
        System.out.println("EmailId1 : " + emailSample1);

        boolean emailSample2 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,}", "abc-100@yahoo.com"); //true
        System.out.println("EmailId2 : " + emailSample2);

        boolean emailSample3 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,}", "abc.100@yahoo.com"); //true
        System.out.println("EmailId3 : " + emailSample3);

        boolean emailSample4 = Pattern.matches("[a-z]+[0-9]+[@]+[a-z]+[.][a-z]{3,}", "abc111@abc.com");//true
        System.out.println("EmailId4 : " + emailSample4);

        boolean emailSample5 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,}", "abc-100@abc.net");//true
        System.out.println("EmailId5 : " + emailSample5);

        boolean emailSample6 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,}+[.][a-z]{2,}", "abc.100@abc.com.au");//true
        System.out.println("EmailId6 : " + emailSample6);

        boolean emailSample7 = Pattern.matches("[a-z]+[@][0-9]+[.][a-z]{3,}", "abc@1.com");//true
        System.out.println("EmailId7 : " + emailSample7);

        boolean emailSample8 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{3,}+[.][a-z]{3,}", "abc@gmail.com.com");//true
        System.out.println("EmailId8 : " + emailSample8);

        boolean emailSample9 = Pattern.matches("[a-z]+[-][.][+][:][0-9]+[@][0-9][a-z]+[.][a-z]{3,}[.][a-z]{3,}[.][a-z]{2,}[.][a-z]{3,}", "abc-.+:100@1gmail.com.com.au.net");//true
        System.out.println("EmailId9 : " + emailSample9);

        System.out.println("");

        Thread.sleep(5000);

        System.out.println("All Invalid emails samples is as follows : ");
        System.out.println("");

        boolean invalidEmailSample1 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{3,}", "abc"); //false
        System.out.println("EmailId1 : " + invalidEmailSample1);

        boolean invalidEmailSample2 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,}", "abc@.com.my"); //false
        System.out.println("EmailId2 : " + invalidEmailSample2);

        boolean invalidEmailSample3 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,}", "abc123@gmail.a"); //false
        System.out.println("EmailId3 : " + invalidEmailSample3);

        boolean invalidEmailSample4 = Pattern.matches("[a-z]+[0-9]+[@]+[a-z]+[.][a-z]{3,}", "abc123@.com");//false
        System.out.println("EmailId4 : " + invalidEmailSample4);

        boolean invalidEmailSample5 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,}", "abc123@.com.com");//false
        System.out.println("EmailId5 : " + invalidEmailSample5);

        boolean invalidEmailSample6 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,}+[.][a-z]{2,}", ".abc@abc.com");//false
        System.out.println("EmailId6 : " + invalidEmailSample6);

        boolean invalidEmailSample7 = Pattern.matches("[a-z]+[@][0-9]+[.][a-z]{3,}", "abc()*@gmail.com");//true
        System.out.println("EmailId7 : " + invalidEmailSample7);

        boolean invalidEmailSample8 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{3,}+[.][a-z]{3,}", "abc@%*.com");//true
        System.out.println("EmailId8 : " + invalidEmailSample8);

        boolean invalidEmailSample9 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{3,}", "abc..2002@gmail.com"); //false
        System.out.println("EmailId9 : " + invalidEmailSample9);

        boolean invalidEmailSample10 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,}", "abc.@.gmail.com"); //false
        System.out.println("EmailId10 : " + invalidEmailSample10);

        boolean invalidEmailSample11 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,}", "abc@abc@gmail.com"); //false
        System.out.println("EmailId11 : " + invalidEmailSample11);

        boolean invalidEmailSample12 = Pattern.matches("[a-z]+[0-9]+[@]+[a-z]+[.][a-z]{3,}", "abc@gmail.com.1a");//false
        System.out.println("EmailId12 : " + invalidEmailSample12);

        boolean invalidEmailSample13 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,}", "abc@gmail.com.aa.au");//false
        System.out.println("EmailId13 : " + invalidEmailSample13);


    }

}
