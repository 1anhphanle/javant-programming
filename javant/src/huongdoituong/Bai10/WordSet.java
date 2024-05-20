package huongdoituong.Bai10;

import java.util.TreeSet;
import java.util.Arrays;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String input) {
        this.set = new TreeSet<>();
        String[] words = input.toLowerCase().split("\\s+");
        this.set.addAll(Arrays.asList(words));
    }

    public WordSet union(WordSet other) {
        WordSet result = new WordSet("");
        result.set.addAll(this.set);
        result.set.addAll(other.set);
        return result;
    }

    public WordSet intersection(WordSet other) {
        WordSet result = new WordSet("");
        for (String word : this.set) {
            if (other.set.contains(word)) {
                result.set.add(word);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return String.join(" ", this.set);
    }
}
