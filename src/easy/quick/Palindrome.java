package easy.quick;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un mot :");
		String word = sc.next();
		word = word.toLowerCase();
		int length = word.length() - 1;
		Boolean isTrue = true;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == word.charAt(length)) {
				length--;
			} else
				isTrue = false;
		}

		if (isTrue) {
			System.out.println("C'est un palindrome");
		} else {
			System.out.println("Ce n'est pas un palindrome");
		}

		sc.close();
	}

}
