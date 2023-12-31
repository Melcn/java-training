package MOOCFI2.Part8.HashMap.Abbreviations;

import java.util.HashMap;

public class Abbreviations {


    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(this.cleanKey(abbreviation), explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(this.cleanKey(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(this.cleanKey(abbreviation));
    }

    public String cleanKey(String key) {
        return key.toLowerCase().trim();
    }
}

