package MOOCFI2;

import MOOCFI2.Part6.SeparatingUserInterfaceFromProgramLogic.ToDoList.TodoList;

import java.util.Scanner;

public class TDListUserInterface {

    private TodoList lists;
    private Scanner scanner;

    public TDListUserInterface(TodoList lists, Scanner scanner) {
        this.scanner = scanner;
        this.lists = lists;
    }

    public void start() {
        while (true) {
            System.out.println("Order? : ");
            String order = scanner.nextLine();


        }
    }
}
