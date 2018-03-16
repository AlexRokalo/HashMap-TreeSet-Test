import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    private Set<String> wordSet;

    UniqueWords(List<String> words){
        wordSet = new TreeSet<>(new SymbolCamporator());
        wordSet.addAll(words);
    }

    public Set<String> getWordSet() {
        return wordSet;
    }
}