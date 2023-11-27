package MOOCFI2.Part5.LearningPoo.OneMinute;

public class ClockTest {

    public static void main(String[] argv) {
/*
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60); */
        Clock clock = new Clock();

        while (true) {
            System.out.println(clock);
            clock.advance();
        }

        /*
        while (true) {

            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.advance();

            if (seconds.value() == 0) {
                minutes.advance();

                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
        }

*/

    }
}