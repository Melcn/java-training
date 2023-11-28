package MOOCFI2.Part9.Inheritance.PersonAndSubclasses;

public class Student extends Person {

    public int credit;

    public Student(String name, String adress) {
        super(name, adress);
        this.credit = 0;
    }

    public int credits() {
        return credit;
    }

    public void study() {
        credit++;
    }

    @Override
    public String toString() {
        return super.toString() + " Study credit: " + this.credits();
    }
}
