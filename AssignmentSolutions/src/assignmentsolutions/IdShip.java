/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsolutions;


import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Er.Yogesh Dahake
 */
public class IdShip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noTest = 0;
        boolean flag = false;
        
        //Ship Name i.e value stored in HashMap with class id i.e key 
        Map<String, Object> data = new HashMap<>();
        data.put("B","BattleShip");
        data.put("C","Cruiser");
        data.put("D","Destroyer");
        data.put("F","Frigate");
        
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
        
        //inputArray stores input character
        char[] inputArray = new char[noTest];
        
        //for loop to take input class id  based on number of Test cases
        for (int i = 0; i < noTest; i++) {
            System.out.println("Enter Class ID for Test Case "+(i+1)+" :");
            char c= sc.next().charAt(0);
            inputArray[i]=c;
        }
        
        
        //below code find out Ship name base on inputted class id
        System.out.println();
        System.out.println("=======OutPut=======");
        System.out.println();
        System.out.println("ClassId  Ship Class");
        for (char c : inputArray) {
            System.out.println(c+"        "+(data.get(String.valueOf(c).toUpperCase())==null?"No ship class found":data.get(String.valueOf(c).toUpperCase())));
        }
        
        
    }

}
