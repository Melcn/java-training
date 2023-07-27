package easy.quick;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		int[] arr = new int[6];

		fill(arr);
		show(arr);
	}

	public static void show(int[] arr) {
		System.out.println("Votre tableau : " + Arrays.toString(arr));
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
