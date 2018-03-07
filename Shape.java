
import java.awt.Graphics;

/* Project# 5
 * Programmer: Michael Gerrard Guerrero
 * Date: July 18, 2013
 * File: Shape.java
 * Class:Computer Science 111H
 * Due Date: July 25, 2013
 */
public abstract class Shape {
    private int x;
    private int y;
    protected final static int X_MAX_SIZE = 800;
    protected final static int Y_MAX_SIZE = 600;
    public Shape() {
        x = 0;
        y = 0;
    }
    public Shape(int newX, int newY) {
        setX(newX);
        setY(newY);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        if(newX <= X_MAX_SIZE) {
            x = newX;
        }
    }
    public void setY(int newY) {
        if(newY <= Y_MAX_SIZE) {
            y = newY;
        }
    }
    public abstract void display();
    public abstract double area();
    public abstract void display(Graphics g);
}

