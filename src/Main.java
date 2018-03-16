import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Что бы перестать писать текст ввидите слово 'STOP' : ");
        ImputText imputText = new ConsoleImputText();
        ImputText name = new NameImputText();
        String line = imputText.read();
        ParceText parceText = new SpaceParceText();
        List<String> words = parceText.handle(line);
        CountWords countWords = new CountWords(words);
        UniqueWords uniqueWords = new UniqueWords(words);
        System.out.println("Ввидите слово для поиска :");
        try {
            System.out.println(countWords.get(name.read()));
        } catch (NullWordException e) {
            System.out.println(e.getMessage());
        }
        for (String word : uniqueWords.getWordSet())
            System.out.println(word);
        countWords.DuplicateWords();
        countWords.info();
    }
}