package easy.quick;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		int[] arr = new int[6];

		fill(arr);
		show(arr);
		System.out.println("La somme :" + sum(arr));
		System.out.println("Le nombre minimum : " + minimum(arr));
		System.out.println("L'indice du nombre maximum : " + indexMax(arr));
		System.out.println("Le tableau opposé : " + Arrays.toString(opposite(arr)));

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

	public static int sum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}

		return sum;
	}

	public static int minimum(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}
		}

		return min;
	}

	public static int indexMax(int[] arr) {

		int max = arr[0];
		int posMax = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
				posMax = i;
			}
		}
		return posMax;
	}

	public static int[] opposite(int[] arr) {
		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		return arr;
	}
}
