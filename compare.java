package practice;
import java.util.*;
public class compare {
	public static void main (String[] args){
		Scanner namein = new Scanner(System.in);
		Scanner agein = new Scanner(System.in);
		Scanner ynin = new Scanner(System.in);
		String yes = "yes";
		String no = "no";
		String[] name = new String[3];
		String[] age = new String[3];
		String[] yn = new String[3];
		
		
		for(int i =1; i<age.length; i++){
			System.out.print("No."+i+" tester's Name:");
			name[i] = namein.nextLine();
			System.out.print("Your Age:");
			age[i] = agein.nextLine();
			System.out.print("are you a pig:");
			yn[i] = ynin.nextLine();
			System.out.println(name[i] +" is " +age[i]+ " years old");
			if(yn[i].equals(yes)){
				System.out.println(name[i]+ " is a pig");
			}else if(yn[i].equals(no)){
				System.out.println(name[i]+ " is a human");
			}
		}
		namein.close();
		agein.close();
		ynin.close();
	}
	
}
