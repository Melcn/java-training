package WOtraining.Part11;

import java.util.Scanner;

public class MainFlightC {
    public static void main(String[] args) {
       
        FlightControl control = new FlightControl();
        Scanner scan = new Scanner(System.in);

        TextUI main = new TextUI(control, scan);

        main.start();

    }
}
