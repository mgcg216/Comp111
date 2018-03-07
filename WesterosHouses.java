package project4;



import java.util.Scanner;

/* Project# 4
 * Programmer: Michael Gerrard Guerrero
 * Date: July 17, 2013
 * File: WesterosHOuses.java
 * Class:Computer Science 111H
 * Due Date: July 18, 2013
 */
public class WesterosHouses {
    String name;
    private String sigil;
    private String words;
    private int numberOfMembers;
    
    public WesterosHouses() {
        name = "Baratheon";
        sigil = "Stag";
        words = "Ours is the Fury";
        numberOfMembers = 3;
    }
    public WesterosHouses(String newName, String newSigil, String newWords, int newNumberOfMembers) {
        setName(newName);
        setSigil(newSigil);
        setWords(newWords);
        setNumberOfMembers(newNumberOfMembers);
    }
    public String getName() {
        return name;
    }
    public String getSigil() {
        return sigil;
    }
    public String getWords() {
        return words;
    }
    public int getNumberOfMembers() {
        return numberOfMembers;
    }
    public void setName(String newName) {
        if(newName.length() >= 4 && newName.length() <= 20) {
            name = newName;
        }
        else {
            System.out.println("Sorry, that is not a valid Last Name");
        }
    }
    public void setSigil(String newSigil) {
        if(newSigil.length() >= 3 && newSigil.length() <= 20) {
            sigil = newSigil;
        }
        else {
            System.out.println("Sorry, that is not a valid Sigil");
        }
    }
    public void setWords(String newWords) {
        if(newWords.length() >= 7 && newWords.length() <= 50){
            words = newWords;
        }
        else {
            System.out.println("Sorry, those are not valid family words.");
        }
    }
    public void setNumberOfMembers(int newNumberOfMembers) {
        if(newNumberOfMembers >=0 && newNumberOfMembers <= 100) {
            numberOfMembers = newNumberOfMembers;
        }
        else {
            System.out.println("Sorry, that is not a valid number of Family members.");
        }
    }
    @Override
    public String toString() {
        return "This is a Westeros family. \nThe name is: " +name+ "\n"
                + "Their Sigil is: "+sigil+ "\n"
                + "Their family words are '" +words+ "'\n"
                + "They currently have " +numberOfMembers+ " family members.";
    }
    public static void main(String[] args) {
        String westerosHouses1Name;
        String westerosHouses1Sigil;
        String westerosHouses1Words;
        int westerosHouses1NumberOfMembers;
        
        Scanner input = new Scanner(System.in);
        WesterosHouses westerosHouses1 = new WesterosHouses();
        System.out.println(westerosHouses1.toString());
        
        System.out.print("\nWhat is the name of the House? ");
        westerosHouses1Name = input.nextLine();
        westerosHouses1.setName(westerosHouses1Name);
        System.out.println("The house has been set to: " +westerosHouses1.getName());
        
        System.out.print("\nWhat is their Sigil? ");
        westerosHouses1Sigil = input.nextLine();
        westerosHouses1.setSigil(westerosHouses1Sigil);
        System.out.println("Thier sigil has been set to: " +westerosHouses1.getSigil());
        
        System.out.print("\nWhat are their words? ");
        westerosHouses1Words = input.nextLine();
        westerosHouses1.setWords(westerosHouses1Words);
        System.out.println("Thier words has been set to: " +westerosHouses1.getWords());
        
        System.out.print("\nHow many family members are alive? ");
        westerosHouses1NumberOfMembers = input.nextInt();
        westerosHouses1.setNumberOfMembers(westerosHouses1NumberOfMembers);
        System.out.println("The number of Family members has been set to: ");
        
        System.out.println();
        System.out.println(westerosHouses1.toString());
    }
}
