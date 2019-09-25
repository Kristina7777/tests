import java.util.HashMap;
import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args)
    {
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.toLowerCase();
        String[] words = string.split("\\s+");


        HashMap<String, Integer> wordToCount = new HashMap<>(); // храним пары слов - количество в HashMap
        System.out.println("<< Подсчет количества раз употребления слов в тексте: >>");

        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);

        }
        for (String word : wordToCount.keySet())

        {
            System.out.println("слово " + " < " + word + " > " + " встречается " + wordToCount.get(word)+ " раз ");
        }
    }
}
