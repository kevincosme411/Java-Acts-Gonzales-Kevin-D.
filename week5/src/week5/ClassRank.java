/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class ClassRank {
    


    // 1. STUDENT CLASS
    static class Student {
        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        // Calculate the student's average quiz score
        double getAverage() {
            int sum = 0;

            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            return (double) sum / quizzes.length;
        }
    }

    // 2. OWN LINEAR SEARCH: Find a student and return their rank
    static int linearSearch(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {

                // Walk backward to find the first student
                // with the same average, so tied students share a rank.
                int position = i;

                while (position > 0 &&
                       Double.compare(
                           students[position - 1].getAverage(),
                           students[i].getAverage()
                       ) == 0) {
                    position--;
                }

                return position + 1;
            }
        }

        return -1; // Student was not found
    }

    // 3. OWN SORTING ALGORITHM: Bubble sort by average, highest first
    static void bubbleSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    // Swap the entire Student objects
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 4. CREATE STUDENT OBJECTS
        Student[] students = {
            new Student("Alex", new int[]{90, 85, 95, 90}),
            new Student("Bella", new int[]{80, 85, 80, 85}),
            new Student("Carlos", new int[]{90, 85, 95, 90}),
            new Student("Diana", new int[]{70, 75, 80, 75}),
            new Student("Ethan", new int[]{85, 90, 80, 85})
        };

        // Sort the students from highest to lowest average
        bubbleSort(students);

        // 5. DISPLAY LEADERBOARD
        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s%n",
                          "Rank", "Name", "Average");
        System.out.println("---------------------------------------");

        int rank = 0;

        for (int i = 0; i < students.length; i++) {

            // Students with the same average share a rank
            if (i == 0 ||
                Double.compare(
                    students[i].getAverage(),
                    students[i - 1].getAverage()
                ) != 0) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                              rank,
                              students[i].name,
                              students[i].getAverage());
        }

        // 6. SEARCH FOR A STUDENT
        System.out.print("\nEnter a student name to search: ");
        String targetName = input.nextLine();

        int studentRank = linearSearch(students, targetName);

        if (studentRank != -1) {
            System.out.println(targetName + "'s rank is: " + studentRank);
        } else {
            System.out.println("Student not found.");
        }

        input.close();
    }

}
