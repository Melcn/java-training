package easy.quick;

import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double grd1;
		double grd2;
		double grd3;
		double average;

		System.out.println("Saisir une premiere note svp");
		grd1 = sc.nextInt();

		System.out.println("Saisir une deuxieme note svp");
		grd2 = sc.nextInt();

		System.out.println("Saisir une troisieme note svp");
		grd3 = sc.nextInt();

		average = (grd1 + grd2 + grd3) / 3;

		if (average > 12) {

			System.out.println("Bien");
		} else if (average < 10) {

			System.out.println("Non admis");
		} else {

			System.out.println("Passable");
		}

		sc.close();
	}

}
