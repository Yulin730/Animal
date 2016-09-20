package practice;
import java.util.*;

public class Whatisup {
	

private static Scanner console;

public static void main (String[] args) {
	
	int guessnumber = 1; 
	Random rand = new Random();
	int number = rand.nextInt(100);
	System.out.println("Guess a number between 1 and 100");
	Scanner console = new Scanner(System.in);
	int guess =console.nextInt();
	System.out.println("Your number is " + guess);
	while (guess != number){
	if (guess > number){
		System.out.println("too big, guess again");
		guess =console.nextInt();
		}
	else{
		System.out.println("too small, guess again");
		guess =console.nextInt();
	}
	guessnumber++;
	}
	System.out.println("You got is right!");
	System.out.println("You used " + guessnumber + " times");
}
}
