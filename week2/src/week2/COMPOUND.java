/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author kevin
 */
public class COMPOUND {
   
    public static void main(String[] args) {

        // Part 1: Compound Growth
        double balance = 1000;

        balance += 200;
        System.out.println("After adding 200: " + balance);

        balance *= 2;
        System.out.println("After multiplying by 2: " + balance);

        balance += 500;
        System.out.println("After adding 500: " + balance);


        // Part 2: Postfix Increment
        int count = 5;

        System.out.println("Postfix result: " + count++);
        System.out.println("Count after postfix: " + count);


        // Part 3: Prefix Increment
        count = 5;

        System.out.println("Prefix result: " + ++count);
        System.out.println("Count after prefix: " + count);

        // Prefix prints the incremented value immediately,
        // while postfix prints the original value before incrementing.
    }
}


