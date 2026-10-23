/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5;

/**
 *
 * @author kevin
 */
public class Classstat {

    public static void main(String[] args) {

        // 1. Declare an array with 8 student scores
        int[] scores = {85, 92, 78, 90, 67, 88, 95, 75};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // 2. Loop through the array to calculate statistics
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // 3. Calculate the average
        double average = (double) sum / scores.length;

        // 4. Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
    }
    


