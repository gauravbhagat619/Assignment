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
public class TwoNumbers {

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
        
        //array with size of noTest cases used to store output
        int[] answer=new int[noTest];

        
        //for loop to take inputs based on noTest
        for (int i = 0; i < noTest; i++) {
            int a, b, noOfTurn, min, max, division=0;
            a = sc.nextInt();  //getting value of a
            b = sc.nextInt();  // getting value of b
            noOfTurn = sc.nextInt(); //getting value of number of turns
            
            //this for loop runs till nuber of turns
            for (int j = 1; j <= noOfTurn; j++) {
                if (j % 2 == 0) {
                    b = b * 2; // Bob's Second Turn value of a gets multiplied by 2 if value of j is odd
                } else {
                    a = a * 2; // Alice's First Turn value of a gets multiplied by 2 if value of j is odd
                }
            }

            if (noTest > 0) {
                // finding out min and max value
                if (a > b) {
                    min = b;
                    max = a;
                } else {
                    min = a;
                    max = b;
                }
                division = max / min; //calculating integer division
            }
            answer[i]=division; //storing division i.e answer into array
        }
        
        System.out.println("======Output======");
        //below for loop prints all answer ouput
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
