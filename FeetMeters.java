/* Project# 1
 * Programmer: Michael Gerrard Guerrero
 * Date: June 18, 2013
 * File: FeetMeters.java
 * Class:Computer Science 111H
 * Due Date: June 20, 2013
 */
import java.util.Scanner;
public class FeetMeters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number for feet: ");
        Double feet = scan.nextDouble();
        Double meters = feet / 3.2808;
        System.out.println("That is " +meters+ " meters");
    }
}
