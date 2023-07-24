package easy.quick;

import java.util.Scanner;

public class Assurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age;
		int year;
		int accident;
		int assurance;

		boolean a;
		boolean b;
		boolean c;

		String cat;

		System.out.println("Saisir un age");
		age = sc.nextInt();

		System.out.println("Saisir année de permis");
		year = sc.nextInt();

		System.out.println("Saisir nombre d'accident");
		accident = sc.nextInt();

		System.out.println("Saisir annee d'assurance");
		assurance = sc.nextInt();
		sc.close();
	}

}
