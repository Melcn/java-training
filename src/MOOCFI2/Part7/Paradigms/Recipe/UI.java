package MOOCFI2.Part7.Paradigms.Recipe;

import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Read inputDocument;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.inputDocument = new Read(this.scanner.nextLine());
    }

    public void start() {}
}
