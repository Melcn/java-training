package MOOCFI2.Part7.Paradigms.GradeStats;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UI interfacee = new UI(new GradeRegister(), new Scanner(System.in));
        interfacee.start();
    }
}
