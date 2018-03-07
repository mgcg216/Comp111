/* Project# 1
 * Programmer: Michael Gerrard Guerrero
 * Date: June 24, 2013
 * File: GradeBook.java
 * Class:Computer Science 111H
 * Due Date: July 2, 2013
 */
import java.util.Scanner;
public class GradeBook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = 0;
        double scoreCounter = 0;
        char grade = 'W';
        int numberOfA = 0;
        int numberOfB = 0;
        int numberOfC = 0;
        int numberOfD = 0;
        int numberOfF = 0;
        double scoreTotal = 0;
        double scoreAverage = 0;
        while (score != -1){
            System.out.print("Please enter a score (-1 to exit):");
            score = scan.nextDouble();
            if(score <= 100 && score >= 0){ 
                grade = gradeScore(score);
                System.out.println("That grade is " +grade);
                scoreCounter++;
                //Determing specific grade totals
                    switch(grade){
                        case 'A':
                            numberOfA++;
                            break;
                        case 'B':
                            numberOfB++;
                            break;
                        case 'C':
                            numberOfC++;
                            break;
                        case 'D':
                            numberOfD++;
                            break;
                        case 'F':
                            numberOfF++;
                            break;
                    }
              //Determing the full score
              scoreTotal = score + scoreTotal; 
            }
        }
    // The Final output
    scoreAverage = scoreTotal / scoreCounter;
    System.out.println("The average Score is " +scoreAverage);
    System.out.println("The average Grade is " +gradeScore(scoreAverage));
    System.out.println("The amount of scores entered: " +scoreCounter);
    System.out.println("The amount of A's: " +numberOfA);
    System.out.println("The amount of B's: " +numberOfB);
    System.out.println("The amount of C's: " +numberOfC);
    System.out.println("The amount of D's: " +numberOfD);
    System.out.println("The amount of F's: " +numberOfF);
    }
    // Determines the grade
    public static char gradeScore(double score){
        char grade = 'Q';
        if (score <= 100 && score >= 90){
            grade = 'A';
        }else if (score < 90 && score >= 80){
            grade = 'B';
        }else if (score < 80 && score >= 70){
            grade = 'C';
        }else if (score < 70 && score >= 60){
            grade = 'D';
        }else if (score < 60 && score >= 0){
            grade = 'F';
        }else{
            System.out.println("You can not enter that value."); 
        }return grade;    
    }
}
