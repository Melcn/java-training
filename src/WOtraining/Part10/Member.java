package WOtraining.Part10;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Member o) {
        return 0;
    }
}
