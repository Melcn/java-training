package MOOCFI2.Part7.Paradigms.GradeStats;

import java.util.Scanner;

public class UI {

    private GradeRegister register;
    private Scanner scanner;

    public UI(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter total points, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            register.add(input);
        }

        if (register.average() != -1) {
            System.out.println("Point average (all): " + register.average());
        } else {
            System.out.println("Point average (all):-");
        }

        if (register.averageGradesAboveGrade(50) != -1) {
            System.out.println("Point average (passing): " + register.averageGradesAboveGrade(50));
        } else {
            System.out.println("Point average (passing):-");
        }

        System.out.println("Pass percentage: " + register.percentageAboveGrade(50));

        System.out.println("Grade distribution:");
        StarPrinter printer = new StarPrinter();
        printer.printer(register.convertGradeScaleToPointScale());
    }
}
