/* Project# 3
 * Programmer: Michael Gerrard Guerrero
 * Date: July 2, 2013
 * File: StringSorter.java
 * Class:Computer Science 111H
 * Due Date: July 11, 2013
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringSorter {
    
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile = new File("instrdata.txt");
        Scanner input = new Scanner(inputFile);
        int arraySize = input.nextInt();
        input.nextLine();
        String[] strdata_array = new String[arraySize];
                for (int i = 0; i < strdata_array.length; i++){
            strdata_array[i] = input.nextLine();
        }
        sortstrings(strdata_array);
        File outputFile = new File("outputstr.txt");
        PrintWriter output = new PrintWriter(outputFile);
        output.println(arraySize);
        for (int i = 0; i < strdata_array.length; i++ ){
        output.println(strdata_array[i]);
        }
        int m = median(strdata_array);
        output.println("Middle number = " +strdata_array[m]);
        output.close();
    }
    public static void sortstrings(String x[]){
        String temp;
        for (int i = 0; i<x.length -1; i++){
            for (int j=i+1; j<x.length; j++){
                if(x[i].compareToIgnoreCase(x[j])>0){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
    public static int median(String arr[]){
        int n = arr.length;
        if (n % 2 ==0){
            return (n/2)-1;
        }else
            return ((n+1)/2);
    }
    
}
