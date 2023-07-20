package algo;

import java.util.Scanner;

public class CalculateTotalPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a;
		int b;
		int tva;
		int total;

		a = 0;
		b = 1;
		tva = 2;
		total = 0;

		System.out.println("Entrez prix HT");
		a = scan.nextInt();

		System.out.println("Entrez nombre articles");

		b = scan.nextInt();

		System.out.println("Entrez taux TVA");

		tva = scan.nextInt();

		total = (a * b) + (a * b * tva / 100);
		System.out.println("Le prix TTC est: " + total);

	}
}
