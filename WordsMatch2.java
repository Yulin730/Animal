package practice;
import java.util.Random;

public class WordsMatch2 {
public static void main(String[] args) {
	String[] People = {"yulin", "Yue","xuesong","lulu"};
	String[] action = {"eat","sleep","play"};
	String[] location = {"in the bedroom","in the kitchen ","in the waterpark"};
	
	int length1 = People.length;
	int length2 = action.length;
	int length3 = location.length;
	
	int peoplegen = (int)(length1 * Math.random());
	int actiongen = (int)(length2 * Math.random());
	int locationgen = (int)(length3* Math.random());
	
	
	String sentence = People[peoplegen] +" "+ action[actiongen] + " " + location[locationgen];
	System.out.println(sentence);
}
}
