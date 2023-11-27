package MOOCFI2;

public class StatisticsTest {

    public static void main(String[] argv) {

        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.getSum());
        System.out.println("Average: " + statistics.average());
    }
}
