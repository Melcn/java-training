package easy.quick;

import java.util.Scanner;

import Book.Book;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book books[] = new Book[3];
		int choice = 0;
		String enterTitle;
		String newTitle;

		books[0] = new Book(1, "Underground", "Haruki Murikami", 15);
		books[1] = new Book(2, "L'alchimiste", "Paulo Coelho", 4);
		books[2] = new Book(3, "Madame Bovary", "Flaubert", 2);

		Book book = new Book();

		showMenu();
		choice = sc.nextInt();
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
