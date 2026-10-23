/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author kevin
 */
public class UnitConvert {
    public static void main(String[] args) {

        // 1. Declare a measurement in centimeters
        double centimeters = 275.5;

        // 2. Explicit narrowing: convert to whole meters
        int meters = (int) (centimeters / 100);

        // 3. Calculate the remaining centimeters
        double remainingCm = centimeters - (meters * 100);

        System.out.println("Original measurement: " + centimeters + " cm");
        System.out.println("Whole meters: " + meters);
        System.out.println("Remaining centimeters: " + remainingCm + " cm");

        // 4. Implicit widening: int to double
        int number = 10;
        double decimalNumber = number; // No cast needed

        System.out.println("Widened value: " + decimalNumber);

        // 5. Explicit narrowing: double to int
        double price = 19.99;
        int wholePrice = (int) price;

        // The decimal part (.99) is discarded, not rounded.
        System.out.println("Original price: " + price);
        System.out.println("Narrowed price: " + wholePrice);
    }

}
