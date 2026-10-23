
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author kevin
 */
public class Primitiveover {
    public static void main(String[] args) {

        // PART 1: PRIMITIVE OVERFLOW
        byte number = 127;

        System.out.println("=== PRIMITIVE OVERFLOW ===");
        System.out.println("Before increment: " + number);

        number++;

        // A byte can store only -128 to 127.
        // Incrementing 127 wraps around to -128.
        System.out.println("After increment: " + number);


        // PART 2: STRING REFERENCES
        System.out.println("\n=== STRING REFERENCES ===");

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";

        // == compares object references, not String contents.
        // s1 and s2 are separate objects created with new.
        System.out.println("s1 == s2: " + (s1 == s2));

        // equals() compares String contents.
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // s1 is a new object; s3 refers to the string literal.
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        // s2 is also a new object, separate from the literal.
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));


        // PART 3: SHARED ARRAY REFERENCE
        System.out.println("\n=== SHARED ARRAY ===");

        int[] array1 = {10, 20, 30};

        // array2 points to the SAME array as array1.
        int[] array2 = array1;

        System.out.println("Before modification:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        // Modify the array through array2.
        array2[0] = 99;

        System.out.println("After modification:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        System.out.println("Same array? " + (array1 == array2));
    }
 
}
