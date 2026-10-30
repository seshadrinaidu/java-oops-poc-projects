package com.inheritance.loanProject;

import java.util.Scanner;

public class PersonalLoan extends Loan {

    public static void main(String[] args) {
        PersonalLoan personalLoan = new PersonalLoan();

        int salary = personalLoan.getSalary();
        int cibil = personalLoan.getCIBIL();

        // 1. Initial Eligibility Evaluation
        if (salary >= 100000 && cibil >= 300 && cibil <= 900) {
            System.out.println("\nYou are Eligible! Checking verification details...");

            // 2. KYC Document Verification Gate
            if (personalLoan.aadhaarValid() && personalLoan.panValid() && personalLoan.phoneNumberValid()) {
                System.out.println("\nYour loan has been approved Successfully!");

                // 3. Process ROI calculation safely using the stored score variable
                int finalRoi = personalLoan.getRateOfInterest(cibil);
                System.out.println("Your final calculated Rate of Interest is: " + finalRoi + "%");
            } else {
                System.out.println("\nLoan Denied: KYC or Document validation failed.");
            }
        } else {
            System.out.println("\nYou are not Eligible for the personal loan.");
        }
    }
}
