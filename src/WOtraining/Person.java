package WOtraining;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
        this.age = age;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
