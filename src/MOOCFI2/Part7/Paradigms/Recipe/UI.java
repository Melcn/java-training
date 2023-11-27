package MOOCFI2.Part7.Paradigms.Recipe;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Read inputDocument;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.inputDocument = new Read(this.scanner.nextLine());
    }

    public void start() {
        ArrayList<Recipes> listedDocument = this.inputDocument.docToRecipe();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }
}
