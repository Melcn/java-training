package MOOCFI2;

public class SimpleDictionnary {

    private String word;
    private String translation;

    public SimpleDictionnary(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "word " + word + " translation : " + translation;
    }
}
