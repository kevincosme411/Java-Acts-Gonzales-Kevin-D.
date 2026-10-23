/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;

/**
 *
 * @author kevin
 */
public class DISCOUNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 1000.00;
        double discount = 5.0;
        
        System.out.println("------------------{DISCOUNT}-----------------");

        
        if(discount==0.0){
        double discountAmount = price * (discount / 100);
        double finalPrice = price - discountAmount;

        System.out.println("Original Price: ₱" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: ₱" + discountAmount);
        System.out.println("Final Price: ₱" + finalPrice);
        
                System.out.println("------------------{DISCOUNT}-----------------");

        }
        if(discount==5.0){
        double discountAmount = price * (discount / 100);
        double finalPrice = price - discountAmount;

        System.out.println("Original Price: ₱" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: ₱" + discountAmount);
        System.out.println("Final Price: ₱" + finalPrice);
        
                System.out.println("------------------{DISCOUNT}-----------------");

        }if(discount==10.0){
        double discountAmount = price * (discount / 100);
        double finalPrice = price - discountAmount;

        System.out.println("Original Price: ₱" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: ₱" + discountAmount);
        System.out.println("Final Price: ₱" + finalPrice);
        
                System.out.println("------------------{DISCOUNT}-----------------");

        } if(discount==15.0){
        double discountAmount = price * (discount / 100);
        double finalPrice = price - discountAmount;

        System.out.println("Original Price: ₱" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: ₱" + discountAmount);
        System.out.println("Final Price: ₱" + finalPrice);
        
                System.out.println("------------------{DISCOUNT}-----------------");

        } else {System.out.println("not valid");}
       
    }
}
    
