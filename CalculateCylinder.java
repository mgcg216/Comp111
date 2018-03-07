/* Project# 1
 * Programmer: Michael Gerrard Guerrero
 * Date: June 18, 2013
 * File: CalculateCylinder
 * Class:Computer Science 111H
 * Due Date: June 20, 2013
 */
import java.util.Scanner;
public class CalculateCylinder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a radius:  ");
        Double radius = scan.nextDouble();
        System.out.print("Please enter a length:  ");
        Double length = scan.nextDouble ();
        Double area = radius * radius * 3.14159;
        Double volume = area * length;
        System.out.print("The volume of the Cylinder is " +volume);
    }
    
}
