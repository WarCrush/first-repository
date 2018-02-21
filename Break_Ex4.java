import java.util.Scanner;

public class Break_Ex4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int counter = 0;

    System.out.println("See if you can guess the correct number");
    System.out.println("Gueass a number from 1 to 10");
    System.out.println("You have 10 attempts");

    while(input.hasNext()){
		if((input.nextInt() == 8) || (counter ==10)){
			System.out.println("Game over");
      		break;
    }

		}
	}
}