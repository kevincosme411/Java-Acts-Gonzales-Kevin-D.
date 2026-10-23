/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author kevin
 */
public class PattGen {
    public static void main(String[] args) {
        int size = 6;

        for (int i = 1; i <= size; i++) {

            // BREAK: Stop the outer loop when row 5 is reached
            if (i == 5) {
                break;
            }

            for (int j = 1; j <= i; j++) {

                // CONTINUE: Skip printing column 3
                if (j == 3) {
                    continue;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
