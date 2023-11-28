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
}
