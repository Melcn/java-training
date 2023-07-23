package easy.quick;

import java.util.Scanner;

public class Bisextile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez une année:");
		int year = sc.nextInt();
		if ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0)) {
			System.out.println("Bisextile");
		} else {
			System.out.println("Non bisextile");
		}
		sc.close();
	}

}
