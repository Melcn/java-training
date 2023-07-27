package easy.quick;

import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		int[] arr = new int[6];

		fill(arr);
		show();
	}

	public static void show() {
		System.out.println("fill the blank");
	}

	public static void fill(int[] arr) {
		Scanner sc = new Scanner(System.in);
		int nb;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Entrez un nbr svp");
			nb = sc.nextInt();

			arr[i] = nb;

		}
		sc.close();
	}
}
