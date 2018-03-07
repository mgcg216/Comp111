
import java.awt.Color;
import java.awt.Graphics;

/* Project# 5
 * Programmer: Michael Gerrard Guerrero
 * Date: July 18, 2013
 * File: Rectangle.java
 * Class:Computer Science 111H
 * Due Date: July 25, 2013
 */
public class Rectangle extends Shape{
    int width;
    int height;
    
    public Rectangle() {
        super();
    }
    public Rectangle(int x, int y, int newWidth, int newHeight) {
        super(x ,y);
        setWidth(newWidth);
        setHeight(newHeight);
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
        System.out.println("This Rectangle has a width of "+width+" and a height of "+height+".\n"
                +"The rectangle coordinates of this circle are: " +"\n"
                + "X = "+getX()+ " Y ="+getY());
    }
    public double area() {
        return width*height;
    }
    public void display(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(getX(), getY(), width, height);
    }
}
