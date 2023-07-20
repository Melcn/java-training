package algo;

import java.util.Scanner;

public class CalculateTotalPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a;
		double b;
		double tva;
		double total;


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
