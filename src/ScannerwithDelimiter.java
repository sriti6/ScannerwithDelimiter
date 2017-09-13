/**
 * purpose:Display Tic Tac Toe
 * Created on Sep 12,2017
 * Author Sriti Ahmed
 */


import java.util.Scanner;

public class ScannerwithDelimiter {
    public static void main(String[] args){
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
        double average;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ten numbers for average");
        n1 = keyboard.nextInt(); // use enter key as delimiter
        keyboard.useDelimiter("\t");
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        n4 = keyboard.nextInt();
        n5 = keyboard.nextInt();
        n6 = keyboard.nextInt();
        n7 = keyboard.nextInt();
        n8 = keyboard.nextInt();
        n9 = keyboard.nextInt();
        n10= keyboard.nextInt();

        average = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10) / 10; // add up all numbers then divided by how many total numbers


        System.out.println(" The average of those ten numbers is " + average);

    }
}
