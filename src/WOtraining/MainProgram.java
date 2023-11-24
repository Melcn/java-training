package WOtraining;

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
}
