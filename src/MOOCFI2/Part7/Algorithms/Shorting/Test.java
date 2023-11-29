package MOOCFI2.Part7.Algorithms.Shorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + Main.smallest(numbers));
        System.out.println("Index of the smallest number: " + Main.indexOfSmallest(numbers));
        System.out.println(Main.indexOfSmallestFrom(numbers, 0));
        System.out.println(Main.indexOfSmallestFrom(numbers, 1));
        System.out.println(Main.indexOfSmallestFrom(numbers, 2));

        int[] numbrs = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbrs));
        Main.swap(numbrs, 1, 0);
        System.out.println(Arrays.toString(numbrs));
        Main.swap(numbrs, 0, 3);
        System.out.println(Arrays.toString(numbrs));

        int[] nmbers = {8, 3, 7, 9, 1, 2, 4};
        Main.sort(nmbers);
    }

}
