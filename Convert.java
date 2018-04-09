/**
 Name: Dylan Weijermans

 File name: Convert.java

 Created on: 03/04/2018

 Brief Description: Enabling the user to choose between running celsius.java, fahrenheit.java

 */

import java.util.Scanner;

public class Convert{	//Start of public class
  public static void main(String[] args){	// Start of public static void
    Scanner input = new Scanner(System.in);

	System.out.println("1. Fahrenheit to Celsius");
    System.out.println("2. Celsius to Fahrenheit");
    System.out.println("3. Exit");

	System.out.print("Choice: ");
	int choice = input.nextInt();

    switch(choice){		//Start of switch
	      case 1:
	        celsius.main(null);
	        break;
	      case 2:
	        System.out.println();
	        fahrenheit.main(null);
	        break;
	     case 3:
		    break;
		 default:
		    System.out.println("Invalid choice");
       		break;
		}	//End of switch
	}	// End of public static void
}	// End of public class
























