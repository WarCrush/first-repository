/**
 Name: Dylan Weijermans

 File name: fahrenheit.java

 Created on: 03/04/2018

 Description: Converting fahrenheit to celsius.

 */

import java.util.Scanner;

public class fahrenheit {              //Start of public class
  public static void main(String args[]){  // Start of public static void
    System.out.print("Enter temperature: ");  // Code to print text on the screen
    	Scanner scanner=new Scanner(System.in);

    	double cel=scanner.nextFloat();
    	double fah=9.0/5.0*cel+32;

    System.out.println(cel+" Fahrenheit is "+fah+" Celsius");
  } // End of public static void
} // End of public class