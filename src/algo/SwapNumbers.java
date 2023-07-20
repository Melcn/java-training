package algo;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nb1;
		int nb2;
		int tmp;

		System.out.println("Saisir un premier nombre svp");
		nb1 = sc.nextInt();

		System.out.println("Saisir un deuxieme nombre svp");
		nb2 = sc.nextInt();

		tmp = nb1;
		nb1 = nb2;
		nb2 = tmp;

		System.out.println("nb1 : " + nb1);
		System.out.println("nb2 : " + nb2);

		sc.close();
	}

}
