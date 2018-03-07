/* Project# 1
 * Programmer: Michael Gerrard Guerrero
 * Date: June 18, 2013
 * File: CalculateTip.java
 * Class:Computer Science 111H
 * Due Date: June 20, 2013
 */
import java.util.Scanner;
public class CalculateTip {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the amount of the product: ");
        Double subtotal = scan.nextDouble();
        System.out.print("Please enter the tip rate like 0.10: ");
        Double tiprate = scan.nextDouble();
        Double tip = subtotal * tiprate;
        Double total = subtotal + tip;
        System.out.println("Your total amount is " +total);
    } 
}
