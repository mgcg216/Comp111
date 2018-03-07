package project4;

/* Project# 4
 * Programmer: Michael Gerrard Guerrero
 * Date: July 17, 2013
 * File: HalloweenCostume.java
 * Class:Computer Science 111H
 * Due Date: July 18, 2013
 */

import java.util.Scanner;
public class HalloweenCostume {
    String replicaOf;
    private String gender;
    private int size;
    
    public HalloweenCostume() {
        replicaOf = "Cat";
        gender = "Female";
        size = 6;
    }
    public HalloweenCostume(String newReplicaOf, String newGender, int newSize) {
        setReplicaOf(newReplicaOf);
        setGender(newGender);
        setSize(newSize);
    }
    public String getReplicaOf() {
        return replicaOf;
    }
    public String getGender() {
        return gender;
    }
    public int getSize() {
        return size;
    }
    public void setReplicaOf(String newReplicaOf) {
        if(newReplicaOf.length() >= 2 && newReplicaOf.length() <= 50) {
            replicaOf = newReplicaOf;
        }
        else{
            System.out.println("Not a valid replication.");
        }
    }
    public void setGender(String newGender) {
        if (newGender.length()>=1 && newGender.length()<=10) {
            gender = newGender;
        }
        else {
            System.out.println("Not a valid gender");
        }
    }
    public void setSize(int newSize) {
        if(newSize > 0 && newSize < 20) {
            size = newSize;
        }
        else {
            System.out.println("Not a valid Size");
        }
    }
    @Override
    public String toString() {
        return "I am a Halloween Costume. \nI am a replica of " +replicaOf+ "\n"
                + "I am made for the " +gender+ " sex \n"
                + "My size is " +size; 
    }
    public static void main(String[] args) {
        String halloweenCostume1ReplicaOf;
        String halloweenCostume1Gender;
        int halloweenCostume1Size;
        
        Scanner input = new Scanner(System.in);
        HalloweenCostume halloweenCostume1 = new HalloweenCostume();
        System.out.println(halloweenCostume1.toString());
        
        System.out.println("\nPlease input any theme for this Halloween Costume: ");
        halloweenCostume1ReplicaOf = input.nextLine();
        halloweenCostume1.setReplicaOf(halloweenCostume1ReplicaOf);
        System.out.println("The theme has been set to: " +halloweenCostume1.getReplicaOf());
        
        System.out.println("\nPlease input the intended gender for this Halloween Costume: ");
        halloweenCostume1Gender = input.nextLine();
        halloweenCostume1.setGender(halloweenCostume1Gender);
        System.out.println("The gender has been set to: " +halloweenCostume1.getGender());
        
        System.out.println("\nPlease input the size for the Halloween Costume: ");
        halloweenCostume1Size = input.nextInt();
        halloweenCostume1.setSize(halloweenCostume1Size);
        System.out.println("The size has been set to: " +halloweenCostume1.getSize());
        
        System.out.println();
        System.out.println(halloweenCostume1.toString());
    }

}
