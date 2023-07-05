package easy.quick;

import java.util.Scanner;

public class landUserNameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		// System.out.println(CodelandUserNameValidation(sc.nextLine()));

		String test = "usernameusernameusername";
		int count = 0;
		
		if (test.length() >= 4 && test.length() <= 25) {
			
			if(Character.isAlphabetic(test.charAt(0))) {
				System.out.println("La premier caractere est une lettre");
			}else {
				System.out.println(" hee non");
			}
			for (int i = 0; i < test.length(); i++) {
				count++;
			}

			System.out.println("nb de caracteres : " + count);
		} else {
			System.out.println("nop");
		}

		sc.close();
	}

	public static String CodelandUserNameValidation(String str) {

		return str;
	}
}
