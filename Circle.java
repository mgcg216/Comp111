
import java.awt.Color;
import java.awt.Graphics;

/* Project# 5
 * Programmer: Michael Gerrard Guerrero
 * Date: July 18, 2013
 * File: Circle.java
 * Class:Computer Science 111H
 * Due Date: July 25, 2013
 */
public class Circle extends Shape {
    private int radius;
    
    public Circle(int x,int y, int newRadius) {
        super(x ,y);
        setRadius(newRadius);
    }
    public Circle(){
        super();
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int newRadius) {
        if(newRadius > 0) {
            radius = newRadius;
        }
    }
    public void display() {
        System.out.println("This circle has a radius of "+radius+ ".\n"
                +"The circle coordinates of this circle are: " +"\n"
                + "X = "+getX()+ " Y ="+getY());
    }
    public double area() {
        return 3.1415*(radius*radius);
    }
        public void display(Graphics g){
        g.setColor(Color.black);
        g.drawOval(getX(), getY(), radius, radius);
    }
}
