package easy.quick;

import java.util.Scanner;

public class PairImpair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 0;
		int pair = 0;
		int impair = 0;

		System.out.println("Saisir un nombre");
		b = sc.nextInt();

		while (a < b) {
			a++;

			if (a % 2 == 0) {
				pair = pair + a;

			} else {
				impair = impair + a;

			}
		}

		System.out.println(pair);
		System.out.println(impair);
		
		sc.close();
	}

}
