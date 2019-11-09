/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsolutions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author batty
 */
public class GrossSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noTest = 0;
        boolean flag = false;

        //below do while loop takes valid input of test cases
        do {
            try {
                System.out.print("Enter Number of Test Cases : ");
                noTest = sc.nextInt();
                if (noTest >= 1 && noTest <= 1000) {
                    flag = true;
                } else {
                    flag = false;
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Number of Test Cases. Try again.");
            }
            sc.nextLine(); // clears the buffer
        } while (!flag);

        int[] inputArray = new int[noTest];
        //for loop to take iput basic salry based on number of test cases
        for (int i = 0; i < noTest; i++) {
            boolean test = false;
            do {
                try {
                    System.out.println("Enter basic salary for Test Case " + (i + 1) + " :");
                    int salary = sc.nextInt();
                    if (salary >= 1 && salary <= 100000) {
                        test = true;
                        inputArray[i] = salary;
                    } else {
                        test = false;
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid basic salary. Try again.");
                }
                sc.nextLine(); // clears the buffer
            } while (!test);
        }

        System.out.println();
        System.out.println("=======OutPut=======");
        System.out.println();
        System.out.println("BasicSalary   HRA    DA         GrossSalary");
        for (int salary : inputArray) {
            double hra = 0.0;
            double da = 0.0;
            double grossSal=0.0;
            if (salary >= 1500) { // if basic salary >= 1500 
                hra = 500; // hra will be 500
                da = ((double)salary * 98) / 100; // da will be 98 % of basic salary     
            } else { //if basic salary < 1500
                hra = ((double)salary * 10) / 100; // hra will be 10 % of basic salary
                da = ((double)salary * 90) / 100;  // da will be 90% of basic salary
            }
            //calculating gross salary
            grossSal=(double)salary+hra+da;
            System.out.println(salary+"        "+hra+"     "+da+"          "+grossSal);
        }

    }
}
