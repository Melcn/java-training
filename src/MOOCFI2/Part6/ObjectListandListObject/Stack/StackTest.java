package MOOCFI2.Part6.ObjectListandListObject.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
    }
}
