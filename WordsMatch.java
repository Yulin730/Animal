package practice;
import java.util.Random;

public class WordsMatch {
public static void main(String[] args) {
	String[] People = {"yulin", "Yue","kobe"};
	String[] action = {"eat","sleep","play"};
	String[] location = {"in the bedroom","in the kitchen ","in the waterpark"};
	
	int length1 = People.length;
	int length2 = action.length;
	int length3 = location.length;
	
	Random rand1 = new Random();
	Random rand2 = new Random();
	Random rand3 = new Random();
	
	int peoplegen = rand1.nextInt(length1);
	int actiongen = rand2.nextInt(length2);
	int locationgen = rand3.nextInt(length3);
	
	String sentence = People[peoplegen] +" "+ action[actiongen] + " " + location[locationgen];
	System.out.println(sentence);
}
}
