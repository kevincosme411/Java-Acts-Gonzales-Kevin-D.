/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author kevin
 */
public class PUZZLE {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 2;

        // Prediction: 11
        int result1 = a + b * c;
        System.out.println("Expression 1: " + result1);
        // Multiplication has higher precedence than addition: 5 + (3 * 2) = 11.


        // Prediction: true
        boolean result2 = a > b && b > c;
        System.out.println("Expression 2: " + result2);
        // Relational operators are evaluated before logical AND:
        // (5 > 3) && (3 > 2) = true && true = true.


        // Prediction: 6
        int x = 4;
        int result3 = x++ + 2;
        System.out.println("Value of x after expression: " + x);
        System.out.println("Expression 3: " + result3);
        // Postfix increment uses the original value (4), then increases x to 5.
        // Therefore, result3 is 4 + 2 = 6, while x becomes 5.


        // Prediction: false
        boolean result4 = a + b > 10 || c == 2 && a < 3;
        System.out.println("Expression 4: " + result4);
        // Arithmetic and relational operators are evaluated before logical operators.
        // && has higher precedence than ||.
        // (8 > 10) || ((2 == 2) && (5 < 3))
        // false || (true && false) = false.
    }

}
