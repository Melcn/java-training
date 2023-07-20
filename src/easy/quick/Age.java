package easy.quick;

import java.util.Scanner;

public class Age {

	public static void main(String[] argv) {

		int a;

		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir un age");
		a = sc.nextInt();

		if (a >= 12) {
			System.out.println("categorie cadet");
		} else if (a >= 10) {
			System.out.println("categorie minime");
		} else if (a >= 8) {
			System.out.println("categorie pupille");
		} else if (a >= 6) {
			System.out.println("categorie poussin");
		} else {
			System.out.println("categorie inexistante");
		}

		sc.close();
	}

}
