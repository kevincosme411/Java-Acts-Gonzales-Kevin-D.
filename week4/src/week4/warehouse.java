/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class warehouse {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Each row represents a warehouse shelf.
        // -1 means the shelf is damaged.
        int[][] warehouse = {
            {10, 5, 8},
            {4, -1, 7},
            {2, 6, 9}
        };

        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Display inventory");
            System.out.println("2. Total inventory");
            System.out.println("3. Find first low-stock shelf");
            System.out.println("4. Restock an item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Display the 2D array
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] == -1) {
                                System.out.print("[DAMAGED] ");
                                continue;
                            }

                            System.out.print(warehouse[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;

                    // Skip damaged shelves when calculating total
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] == -1) {
                                continue;
                            }

                            total += warehouse[i][j];
                        }
                    }

                    System.out.println("Total inventory: " + total);
                    break;

                case 3:
                    boolean found = false;

                    // Find the first shelf with fewer than 5 items
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] == -1) {
                                continue;
                            }

                            if (warehouse[i][j] < 5) {
                                System.out.println(
                                    "Low stock at row " + (i + 1)
                                    + ", column " + (j + 1)
                                    + ": " + warehouse[i][j] + " items"
                                );

                                found = true;
                                break; // Exit the inner loop
                            }
                        }

                        if (found) {
                            break; // Exit the outer loop too
                        }
                    }

                    if (!found) {
                        System.out.println("No low-stock shelves found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter row (1-3): ");
                    int row = input.nextInt();

                    System.out.print("Enter column (1-3): ");
                    int col = input.nextInt();

                    // Validate shelf coordinates
                    while (row < 1 || row > warehouse.length
                            || col < 1 || col > warehouse[0].length) {
                        System.out.println("Invalid shelf coordinates.");
                        System.out.print("Enter row (1-3): ");
                        row = input.nextInt();
                        System.out.print("Enter column (1-3): ");
                        col = input.nextInt();
                    }

                    if (warehouse[row - 1][col - 1] == -1) {
                        System.out.println("Cannot restock a damaged shelf.");
                    } else {
                        int amount;

                        System.out.print("Enter restock amount (greater than 0): ");
                        amount = input.nextInt();

                        // Keep asking until the amount is valid
                        while (amount <= 0) {
                            System.out.print("Amount must be positive. Try again: ");
                            amount = input.nextInt();
                        }

                        warehouse[row - 1][col - 1] += amount;

                        System.out.println("Restock successful!");
                        System.out.println(
                            "New stock: " + warehouse[row - 1][col - 1]
                        );
                    }
                    break;

                case 5:
                    System.out.println("Exiting inventory system...");
                    break;

                default:
                    System.out.println("Invalid option. Choose 1-5.");
            }

        } while (choice != 5);

        input.close();
    }

}
