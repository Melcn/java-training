package WOtraining;

import java.util.ArrayList;
import java.util.Scanner;

public class WordSet {

    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
