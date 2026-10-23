/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author kevin
 */
public class GRADETHRESHOLDCHECKER {
 
    public static void main(String[] args) {

        double average = 91;
        int absences = 4;

        if ((average >= 75 && absences <= 3) || (average >= 90)) {
            System.out.println("PASS");
            System.out.println("Reason: You have an average of " + average
                    + " and " + absences + " absences.");

        } 
        
        else {
            System.out.println("FAIL");
            System.out.println("Reason: Your average is below 90 and you do not meet both the minimum average and attendance requirements.");
        }
    }
}


