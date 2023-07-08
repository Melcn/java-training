package easy.quick;

import java.util.Scanner;

public class FindIntersection {

	/*
	 * Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: 
	 * the first element will represent a list of comma-separated numbers sorted in ascending order, 
	 * the second element will represent a second list of comma-separated numbers (also sorted). 
	 * 
	 * Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. 
	 * If there is no intersection, return the string false.
	 * 
	 * */
	
	
	public static String FindIntersection(String[] strArr) {
		return strArr[0];
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] test = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
		System.out.println(FindIntersection(test));
		//System.out.println(FindIntersection(s.nextLine()));

	}

}
