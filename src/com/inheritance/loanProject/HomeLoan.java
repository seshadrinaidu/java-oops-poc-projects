package com.inheritance.loanProject;

public class HomeLoan extends Loan{
    public static void main(String[] args){
        HomeLoan homeLoan=new HomeLoan();
        int salary = homeLoan.getSalary();
        int cibil = homeLoan.getCIBIL();
        if (salary>=500000 && (cibil>=300 && cibil<=900)){
            System.out.println("\nYou are Eligible! Checking verification details...");
            if (homeLoan.aadhaarValid() && homeLoan.panValid() && homeLoan.phoneNumberValid()){
                System.out.println("\nYour loan has been approved Successfully!");
                int finalRoi=homeLoan.getRateOfInterest(homeLoan.getCIBIL());
                System.out.println("Your final calculated Rate of Interest is: " + finalRoi + "%");
            }

        }else{
            System.out.println("\nYou are not Eligible for the personal loan.");
        }
    }
}
