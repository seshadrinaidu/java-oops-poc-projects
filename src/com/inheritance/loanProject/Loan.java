package com.inheritance.loanProject;

import java.util.Scanner;

public class Loan {
    static Scanner sc = new Scanner(System.in);

    int getSalary() {
        System.out.print("Enter your Salary: ");
        return sc.nextInt();
    }

    int getCIBIL() {
        System.out.print("Enter your CIBIL score: ");
        return sc.nextInt();
    }

    // Accepts the score as a parameter to avoid re-triggering scanner inputs
    int getRateOfInterest(int score) {
        int roi = 14;

        if (score >= 771 && score <= 900) {
            System.out.println("Excellent CIBIL score! High chances to get a loan.");
            roi -= 5;
        }
        else if (score >= 721 && score <= 770) {
            System.out.println("Best CIBIL score! Very favorable loan terms.");
            roi -= 4;
        }
        else if (score >= 681 && score <= 720) {
            System.out.println("Good CIBIL score. Standard approval parameters apply.");
            roi -= 2;
        }
        else if (score >= 600 && score <= 680) {
            System.out.println("Average CIBIL score. Limited negotiation power.");
            roi += 1;
        }
        else {
            System.out.println("Poor CIBIL score. High risk of rejection or premium rates.");
            roi += 4;
        }
        return roi;
    }

    boolean aadhaarValid() {
        System.out.print("Enter Aadhaar Number: ");
        String aadhaar = sc.next();
        return aadhaar.matches("^[2-9][0-9]{11}$");
    }

    boolean panValid() {
        System.out.print("Enter PAN Number: ");
        String pan = sc.next();
        // Fixed pattern: 5 uppercase letters, 4 sequential digits, 1 uppercase letter
        return pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]$");
    }

    boolean phoneNumberValid() {
        System.out.print("Enter Phone Number: ");
        String phone = sc.next();
        return phone.matches("^[6-9][0-9]{9}$");
    }
}
