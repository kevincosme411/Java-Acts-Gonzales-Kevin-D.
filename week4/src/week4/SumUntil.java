/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class SumUntil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int total = 0;

        while (number != -1) {
            System.out.print("Enter an integer (-1 to stop): ");
            number = input.nextInt();

            if (number != -1) {
                total += number;
            }
        }

        System.out.println("Total: " + total);

        input.close();
    }
}

    

