import java.util.Arrays;
import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {

        System.out.println("<< Начало работы программы >>");
        String str2 = "";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str1 = in.nextLine();
        in.close();

        // считает количество слов

        int wordCount = 1;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                wordCount++;
            }
        }

        System.out.println("Количество слов -  " + wordCount);


        //делает первую букву каждого слова заглавной

        str2 = str2 + str1.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < str1.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(str1.substring(i - 1, i)))
                str2 = str2 + str1.substring(i, i + 1).toUpperCase();
            else
                str2 = str2 + str1.substring(i, i + 1);

        }

        System.out.println("Каждое слово начинается с заглавной буквы: " + str2);
        System.out.println("Сортировка введенных слов по алфавиту:");

        //выводит слова в отсортированном виде

        String s = str1;
        String[] words = s.split("\\s+"); // регулярное выражение, означающее символы пробела, табуляции и перевода строки.
        Arrays.sort(words);
        for (String word : words) {

            System.out.println(word);

        }
        System.out.println("<< Конец работы программы!!! >>");
    }
}
