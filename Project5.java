
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* Project# 5
 * Programmer: Michael Gerrard Guerrero
 * Date: July 18, 2013
 * File: Project5.java
 * Class:Computer Science 111H
 * Due Date: July 25, 2013
 */
public class Project5 extends JFrame {
  private Shape [] thearray = new Shape[100];  // 100 Shapes, circle's, tri's and rects
  public Project5() {
    MyPanel panel = new MyPanel();
    add(panel);
    setTitle("Project 5");
    setSize(600, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main (String [] args) {
    Project5 tpo = new Project5();
    tpo.run();
  }  // end of main
  
  public void run () {
    int count = 0;
    // ------------------------   Fill the array section ----------------------
    thearray[count++] = new Circle(0, 200, 300);
    thearray[count++] = new Triangle(250, 100, 50, 50);
    thearray[count++] = new Triangle(300, 100, 50, 50);
    thearray[count++] = new Rectangle(0, 100, 250, 50);
    thearray[count++] = new Rectangle(350, 100, 250, 50);
    thearray[count++] = new Circle(50, 50, 60);
    // ------------------------------  array fill done ------------------------
 
    //---------------------------  loop through the array  --------------------
    for (int i = 0; i < count; i ++ ) {    // loop through all objects in the array
       thearray[i].display();              // don’t care what kind of object, display it
    }  // end for loop
    int offset = 0;
    double totalarea = 0.0;
    while (thearray[offset] != null) {          // loop through all objects in the array
       totalarea = totalarea + thearray[offset].area();   // get area for this object
       offset++;
    } // end while loop
    System.out.println("The total area for " + offset + " Shape objects is " + totalarea);
  }  // end of run
  public class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Shape s : thearray) {
            if(s != null) {
                s.display(g);
            }
        }
        repaint();
    }
}
}  // end of class Project5