/**
 Name: Dylan Weijermans

 File name: celsius.java

 Created on: 03/04/2018

 Brief Description: Converting celsius to fahrenheit.

 */

import java.util.Scanner;

public class celsius {	//Start of public class
  public static void main(String args[]){	// Start of public static void
    System.out.print("Enter temperature: ");
    	Scanner scanner=new Scanner(System.in);

    	double fah=scanner.nextFloat();
    	double cel=5.0/9.0*(fah-32);

    System.out.println(fah+" Fahrenheit is "+cel+" Celsius");
  } // End of public static void
}	// End of public class