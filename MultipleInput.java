package practice;
import java.util.*;
public class MultipleInput {
public static void main(String[] args) {
	int[] age;
	age = new int[10];
	Scanner in = new Scanner(System.in);
	for(int i =0; i< 10; i++){
		age[i] = in.nextInt();
		System.out.println(age[i]);
	}
	in.close();
}

}
