package practice;
import java.util.*;

public class ValidatingUserinput {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number = 0;
	boolean isNumber;
	
	do{
		System.out.println("enter an int please");
		if (input.hasNextInt()){
			number = input.nextInt();
			isNumber = true;
		}else{
			System.out.println("I don't understand you");
			isNumber = false;
			input.next();
		}
	}while (!(isNumber));
	System.out.println(number);
	input.close();
}
}
