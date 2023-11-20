package WOtraining;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public int ageAsYears() {
        return birthday.getYear();
    }

    public boolean olderThan(Person compared) {
        int ownYear = this.getBirthday().getYear();
        int comparedYear = compared.getBirthday().getYear();

        if (ownYear < comparedYear) {
            return true;
        }

        if (ownYear > comparedYear) {
            return false;
        }

        int ownMonth = this.getBirthday().getMonth();
        int comparedMonth = compared.getBirthday().getMonth();

        if (ownMonth < comparedMonth) {
            return true;
        }

        if (ownMonth > comparedMonth) {
            return false;
        }

        int ownDay = this.getBirthday().getDay();
        int comparedDay = compared.getBirthday().getDay();

        if (ownDay < comparedDay) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
