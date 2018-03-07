package project4;



import java.util.Scanner;

/* Project# 4
 * Programmer: Michael Gerrard Guerrero
 * Date: July 17, 2013
 * File: GameConsole.java
 * Class:Computer Science 111H
 * Due Date: July 18, 2013
 */
public class GameConsole {
    String brand;
    private double cost;
    private int generation;
            
    public GameConsole() {
        brand = "Playstation 4";
        cost = 399.99;
        generation = 8;
    }
    public GameConsole(String newBrand, double newCost, int newGeneration) {
        setBrand(newBrand);
        setCost(newCost);
        setGeneration(newGeneration);
    }
    public String getBrand() {
        return brand;
    }
    public double getCost() {
        return cost;
    }
    public int getGeneration() {
        return generation;
    }
    public void setBrand(String newBrand) {
        if(newBrand.length()>=2 && newBrand.length()<=40) {
            brand = newBrand;
        }
        else {
            System.out.println("Sorry, that is not a valid brand name. ");
        }
    }
    public void setCost(double newCost) {
        if(newCost >= 50 && newCost <= 1000) {
            cost = newCost;
        }
        else {
            System.out.println("Sorry, that is not a valid price. ");
        }
    }
    public void setGeneration(int newGeneration) {
        if(newGeneration >= 1&& newGeneration <= 10) {
            generation = newGeneration;
        }
        else {
            System.out.println("Sorry, that not a valid generation. ");
        }
    }
    @Override
    public String toString() {
        return "I am a Game Console. \nMy Brand is: " +brand+ "\n"
                +"The launch cost was/is: "+cost+ " dollars.\n"
                +"The Game Console is part of the "+generation+" generation";
    }
    public static void main(String[] args) {
        String gameConsole1Brand;
        double gameConsole1Cost;
        int gameConsole1Generation;
        
        Scanner input = new Scanner(System.in);
        GameConsole gameConsole1 = new GameConsole();
        System.out.println(gameConsole1.toString());
        
        System.out.print("\nPlease input the brand for this Game Console: ");
        gameConsole1Brand = input.nextLine();
        gameConsole1.setBrand(gameConsole1Brand);
        System.out.println("The brand has been set to: " +gameConsole1.getBrand());
        
        System.out.print("\nPlease input the Launch cost: ");
        gameConsole1Cost= input.nextDouble();
        gameConsole1.setCost(gameConsole1Cost);
        System.out.println("The Launch cost has been set to: "+gameConsole1.getCost());
        
        System.out.print("\nPlease input the Generation of the console: ");
        gameConsole1Generation = input.nextInt();
        gameConsole1.setGeneration(gameConsole1Generation);
        System.out.println("The Generation is set to: "+gameConsole1.getGeneration());
        
        System.out.println();
        System.out.println(gameConsole1.toString());
        
    }
}
