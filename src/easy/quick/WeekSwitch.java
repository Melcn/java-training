package easy.quick;

import java.util.Scanner;

public class WeekSwitch {

	public static void main(String argv[]) {

		int a;

		a = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Saisir un nbr entre 1 et 7");
		a = scan.nextInt();

		switch (a) {

		case 1:
			System.out.println("Lundi");
			break;

		case 2:
			System.out.println("Mardi");
			break;

		case 3:
			System.out.println("Mercredi");
			break;

		case 4:
			System.out.println("Jeudi");
			break;

		case 5:
			System.out.println("Vendredi");
			break;

		case 6:
			System.out.println("Samedi");
			break;

		case 7:
			System.out.println("Dimanche");
			break;

		default:
			System.out.println("Erreur");
			break;
		}
	}
}
