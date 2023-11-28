package MOOCFI2.Part7.Algorithms.Shorting;

public class Main {

    public static int smallest(int[] array) {
        int nb = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < nb) {
                nb = array[i];
            }
        }
        return nb;
    }

    public static int indexOfSmallest(int[] array) {
        int nb = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < nb) {
                nb = i;
            }
        }
        return nb;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int nb = table[startIndex];
        for (int i = 0; i < table.length; i++) {
            if (table[i] < nb) {
                nb = i;
            }
        }
        return nb;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;
        }

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
        }
    }
}
