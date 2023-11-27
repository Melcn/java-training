package MOOCFI2.Part11.Packages.FlightControl;

import MOOCFI2.Part11.Packages.FlightControl.logic.FlightControl;
import MOOCFI2.Part11.Packages.FlightControl.ui.TextUI;

import java.util.Scanner;

public class MainFlightC {
    public static void main(String[] args) {

        FlightControl control = new FlightControl();
        Scanner scan = new Scanner(System.in);

        TextUI main = new TextUI(control, scan);

        main.start();

    }
}
