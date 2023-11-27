package WOtraining.Part10;

import java.util.ArrayList;

public class Divisible {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = (ArrayList<Integer>) numbers.stream();

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }


}
