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

		a = age >= 25;
		b = year >= 2;
		c = assurance >= 5;

		if (!a && b) {
			if (accident >= 1) {
				cat = "refus";
			} else {
				cat = "rouge";
			}
		} else if ((a && !b) || (a && b)) {
			if (accident == 0) {
				cat = "orange";
			} else if (accident == 1) {
				cat = "rouge";
			} else {
				cat = "refus";
			}
		} else {
			if (accident == 0) {
				cat = "vert";
			} else if (accident == 1) {
				cat = "orange";
			} else if (accident == 2) {
				cat = "rouge";
			} else {
				cat = "refusé";
			}
		}

		if (c) {
			if (cat == "rouge") {
				cat = "orange";
			} else if (cat == "orange") {
				cat = "vert";
			} else {
				cat = "bleu";
			}
		}

		System.out.println(" Vous beneficiez du tarif " + cat);
		sc.close();
	}

}
