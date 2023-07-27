package easy.poo;

import java.util.Scanner;


public class AMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		ASociety society = new ASociety();
		AEmployee employees[] = new AEmployee[4];
		
		String name;
		int id;
		double salary;
		
		showMenu();
		choice = sc.nextInt();

		switch (choice) {
		case 1: 

			System.out.println("Entrez le nom de l'employé");
			name = sc.next();
			System.out.println("Entrez l'id de l'employe");
			id = sc.nextInt();
			System.out.println("Entrez le salaire de l'employé");
			salary = sc.nextInt();
			
			AEmployee e = new AEmployee(name, id, salary);
			society.hire(employees , e);
			
			System.out.println(society.toString());
			break;
		
		case 2: 

			break;
		
		case 3: 

			break;
		

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		sc.close();
	}

	public static void showMenu() {

		System.out.println("Que souhaitez vous faire");
		System.out.println("1. Embaucher un employé");
		System.out.println("2. Augmenter tous les employés");
		System.out.println("3. Augmenter un employé");
	}
}
