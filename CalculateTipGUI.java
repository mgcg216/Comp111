/* Project# 1
 * Programmer: Michael Gerrard Guerrero
 * Date: June 18, 2013
 * File: WelcomeInMessageDialogBox.java
 * Class:Computer Science 111H
 * Due Date: June 20, 2013
 */

import javax.swing.JOptionPane;
public class CalculateTipGUI {
        public static void main(String[] args){
        String subtotalstring = JOptionPane.showInputDialog(null,"Please enter "
                + "the amount of the product" );
        Double subtotal = Double.parseDouble(subtotalstring);
        String tipratestring = JOptionPane.showInputDialog(null,"Please enter"
                 + " the tip rate like 0.10: " );
        Double tiprate = Double.parseDouble(tipratestring);
        Double tip = subtotal * tiprate;
        Double total = subtotal + tip;
        JOptionPane.showMessageDialog(null, "Your total amount is " +total);
    } 
}