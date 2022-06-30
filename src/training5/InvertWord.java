package training5;

public class InvertWord {
    public static void main(String[] args) {
        String str = "Это строка в которой надо инвертировать каждое слово";

        String[] words = new StringBuilder(str).reverse().toString().split(" ");

        StringBuilder reverseWord = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) reverseWord.append(words[i]).append(" ");
        System.out.println("The given string is : " + str);
        System.out.println("The string reversed word by word is : " + reverseWord);

    }
}
