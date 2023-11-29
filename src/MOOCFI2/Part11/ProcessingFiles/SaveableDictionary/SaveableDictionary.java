package MOOCFI2.Part11.ProcessingFiles.SaveableDictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private File file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String fileName) {
        this.dictionary = new HashMap<>();
        this.file = new File(fileName);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file.getName()));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;

        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter pw = new PrintWriter(this.file.getName());
            for (String s : this.dictionary.keySet()) {
                String word = s;
                String translation = this.dictionary.get(s);
                pw.println(word + ":" + translation);
            }

            pw.close();
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
