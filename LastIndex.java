package practice;

public class LastIndex {
	public static void main (String[] args) {
		int[] values = {100, 80, 7, 74, 85, 102, 99, 101, 85, 56};
		
		int value = 80;
		int index = lastIndexOf(values, value);
		
		System.out.println("the last index of the value "+ value + " is " + index);
	}
	
	public static int lastIndexOf(int[] values, int value) {
		int index = -1;
		int counter = 0;
		for (int i : values) {//: can be read as in, so for each integer element in values;
			if (i == value) {
				index = counter;
			}
			counter ++;
		}
		return index;
	}
}