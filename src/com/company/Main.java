package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Username Set-up
        System.out.println("Hello. Please enter your name");

        Scanner robotName = new Scanner(System.in);

        String inputUserName = robotName.nextLine();

        System.out.println("Welcome " + inputUserName);

        //Password Set-up
        String Password = "Hello";

        System.out.println("Please enter your Password"); //Desplays on page

        Scanner robotPassword = new Scanner(System.in); //Builds ability to Scan the password being entered

        String inputPassword = robotPassword.nextLine(); //Activates Scanner to view password being entered

        if(inputPassword.equals(Password)) {
            System.out.println("Access Grainted"); //Desplays if PW was entered correctly
    } else {
            System.out.println("Password Incorrect");
        }
    }
}

