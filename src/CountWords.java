import java.util.*;

public class CountWords {
    private List<String> wordList;
    private Map<String, Integer> wordsMap;
    private int allCount;

    CountWords(List<String> words) {
        wordList = new ArrayList<>(words);
        wordsMap = new HashMap<>();
        for (String word : words) {
            wordsMap.put(word, Count(word));
        }
    }

    public String get(String key) throws NullWordException {
        String tmp = "";
        if (wordsMap.containsKey(key) == false) {
            throw new NullWordException("'" + key +"' не содержиться в данном тексте");
        } else
            tmp = key + " повторяется " + wordsMap.get(key);
        return tmp;
    }

    public void info() {
        System.out.println(wordsMap);
    }

    public void DuplicateWords() {
        for (Map.Entry<String, Integer> pair : wordsMap.entrySet()) {
            if (pair.getValue() > 1)
                System.out.println("' " + pair.getKey() + "' " + " встречается : " + pair.getValue());
        }
    }

    private int Count(String word) {
        allCount = 0;
        for (int i = 0; i < wordList.size(); i++)
            if (wordList.get(i).equals(word)) {
                allCount++;
            }

        return allCount;
    }
}