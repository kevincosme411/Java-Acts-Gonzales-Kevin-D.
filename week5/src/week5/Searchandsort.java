/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Arrays;
/**
 *
 * @author kevin
 */
public class Searchandsort {
    
 



    public static void main(String[] args) {

        // Original array of student scores
        int[] scores = {85, 92, 78, 90, 67, 88, 95, 75};

        // 1. LINEAR SEARCH
        int target = 90;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(target + " found at index " + foundIndex);
        } else {
            System.out.println(target + " was not found.");
        }

        // 2. SORT A COPY
        // Copy the array so the original scores remain unchanged.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        Arrays.sort(sortedScores);

        // 3. DISPLAY BOTH ARRAYS
        System.out.println("Original scores: " + Arrays.toString(scores));
        System.out.println("Sorted scores:   " + Arrays.toString(sortedScores));
    }

}
