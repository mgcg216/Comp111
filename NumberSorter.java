/* Project# 3
 * Programmer: Michael Gerrard Guerrero
 * Date: July 2, 2013
 * File: NumberSorter.java
 * Class:Computer Science 111H
 * Due Date: July 11, 2013
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class NumberSorter {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("indata.txt");
        Scanner input = new Scanner(inputFile);
        int arraySize = input.nextInt();
        int[] data_array = new int[arraySize];
        for (int i = 0; i < data_array.length; i++){
            data_array[i] = input.nextInt();
        }
        sort(data_array);
        File outputFile = new File("output.txt");
        PrintWriter output = new PrintWriter(outputFile);
        output.println(arraySize);
        for (int i = 0; i < data_array.length ; i++ ){
            output.println(data_array[i]);
        }
        double sum = 0;
        for(int i = 0; i < data_array.length; i++){
            sum = sum + data_array[i];
        }
        output.println("Average is = " +sum/arraySize);
        output.close();
    }
    public static void sort(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int minAt = i+1;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<min){
                    minAt = j;
                    min = arr[j];
                }
            }
            int temp = arr[i];
                arr[i] = arr[minAt];
                arr[minAt] = temp;
        }
    }
} 
