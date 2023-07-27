package easy.poo;

import java.util.Scanner;

public class AMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		showMenu();
		sc.close();
	}

	public static void showMenu() {

		System.out.println("Que souhaitez vous faire");
		System.out.println("1. Embaucher un employé");
		System.out.println("2. Augmenter tous les employés");
		System.out.println("3. Augmenter un employé");
	}
}
