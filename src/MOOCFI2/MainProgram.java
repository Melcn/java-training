package MOOCFI2;

public class MainProgram {

    public MainProgram() {

    }

    public static int smallest(int[] array) {
        int s = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < s) {
                s = array[i];
            }

        }
        return s;

    }

    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }

        return -1;
    }
}
