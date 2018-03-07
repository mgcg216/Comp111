/* Project# 1
 * Programmer: Michael Gerrard Guerrero
 * Date: June 18, 2013
 * File: ConvertTemp.java
 * Class:Computer Science 111H
 * Due Date: June 20, 2013
 */
import java.util.Scanner;
public class ConvertTemp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Please input the degrees in celsius");
        double celsius = scan.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;  
        System.out.println("That is " + fahrenheit + " in fahrenheit");
    }   
}
