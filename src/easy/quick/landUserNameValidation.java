package easy.quick;

import java.util.Scanner;

public class landUserNameValidation {

	public static void main(String[] args) {

		/*
		 * 1. The username is between 4 and 25 characters. 2. It must start with a
		 * letter. 3. It can only contain letters, numbers, and the underscore
		 * character. 4. It cannot end with an underscore character.
		 * 
		 * If the username is valid then your program should return the string true,
		 * otherwise return the string false.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(CodelandUserNameValidation(sc.nextLine()));

		sc.close();
	}

	public static boolean CodelandUserNameValidation(String str) {

		String regEx = "^[A-Za-z][A-Za-z0-9]*[A-Za-z0-9]$";
		/* [\\w] -> lettres + chiffres + underscore */
		if (str.length() >= 4 && str.length() <= 25) {
			return str.matches(regEx);
		} else {
			return false;
		}
	}
}
