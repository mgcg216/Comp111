
import java.awt.Color;
import java.awt.Graphics;

/* Project# 5
 * Programmer: Michael Gerrard Guerrero
 * Date: July 18, 2013
 * File: Triangle.java
 * Class:Computer Science 111H
 * Due Date: July 25, 2013
 */
public class Triangle extends Shape{
    private int base;
    private int height;
    
    public Triangle() {
        super();
    }
    public Triangle(int x, int y, int newBase, int newHeight) {
        super(x ,y);
        setBase(newBase);
        setHeight(newHeight);
    }
    public void setBase(int newBase) {
        if(newBase>0) {
            base = newBase;
        }
        else {
            System.out.println("Not a valid input.");
        }
    }
     public void setHeight(int newHeight) {
        if(newHeight>0) {
            height = newHeight;
        }
        else {
            System.out.println("Not a valid input.");
        }
    }
    public void display() {
        System.out.println("This Triangle has a base of "+base+" and a height of "+height+".\n"
                +"The rectangle coordinates of this circle are: " +"\n"
                + "X = "+getX()+ " Y ="+getY());
    } 
    public double area() {
        return .5*base*height;
    }
    public void display(Graphics g){
        g.setColor(Color.black);
        g.drawLine(getX() + base/2, getY(), getX(), getY() + height);
        g.drawLine(getX() + base/2, getY(), getX() + base, getY() + height);
        g.drawLine(getX() + base, getY() + height, getX(), getY() + height);
    }
}
