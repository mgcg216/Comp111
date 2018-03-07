
import java.awt.Color;
import java.awt.Graphics;

/* Project# 5
 * Programmer: Michael Gerrard Guerrero
 * Date: July 18, 2013
 * File: Square.java
 * Class:Computer Science 111H
 * Due Date: July 25, 2013
 */
public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(int x, int y, int newWidth, int newHeight) {
        super.setWidth(newWidth);
        super.setHeight(newHeight);
    }
    public void setWidth(int newWidth) {
        if(newWidth>0) {
            width = newWidth;
        }
        else {
            System.out.println("Not a valid input.");
        }
    }
    public void setHeight(int newHeight) {
        if(newHeight>0) {
            height = newHeight;
        }
    }
    public void display() {
        System.out.println("This Square has a width and height of "+height+".\n"
                +"The rectangle coordinates of this circle are: " +"\n"
                + "X = "+getX()+ " Y ="+getY());
    }
    public double area() {
        return width*height;
    }
}
