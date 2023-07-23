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

		do {
			showMenu();
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Entrez un id svp");
				book.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Entrez un titre svp");
				book.setTitle(sc.nextLine());
				System.out.println("Entrez un auteur svp");
				book.setAuthor(sc.nextLine());
				System.out.println("Entrez un prix svp");
				book.setPrice(sc.nextInt());
				addBook(book, books);
				break;

			case 2:

				System.out.println("Saisir le titre du Livre que vous recherchez svp");
				sc.nextLine();
				enterTitle = sc.nextLine();
				System.out.println(read(enterTitle, books));
				break;

			case 3:
				break;
			case 4:
				break;
			case 5:
				break;

			}
		} while (choice != 0);

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

	public static void addBook(Book b, Book bks[]) {
		boolean tmp = false;

		for (int i = 0; i < bks.length; i++) {

			if (bks[i] != null && bks[i].getTitle().equals(b.getTitle())) {
				tmp = true;
			}
		}

		if (tmp == false) {

			for (int i = 0; i < bks.length; i++) {

				if (bks[i] == null) {
					bks[i] = b;
					break;
				}
			}
		}
	}

	public static Book read(String title, Book bks[]) {

		for (int i = 0; i < bks.length; i++) {

			if (bks[i] != null && bks[i].getTitle().equals(title)) {

				return bks[i];
			}

		}
		return null;
	}

	public static void update(String title, Book bks[], String newTitle) {

		for (int i = 0; i < bks.length; i++) {

			if (bks[i] != null && bks[i].getTitle().equals(title)) {
				bks[i].setTitle(newTitle);
			}
		}
	}
}
