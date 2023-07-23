package easy.quick;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.close();
	}
	
	public static void showMenu() {

		System.out.println("----Que souhaitez vous faire?----");
		System.out.println("-------1. Ajouter un livre-------");
		System.out.println("------2. Rechercher un livre-----");
		System.out.println("-------3. Modifier un livre------");
		System.out.println("------4. Supprimer un livre------");
		System.out.println("-----5. Consulter les livres-----");
		System.out.println("-----------0. Quitter------------");
	}
}
