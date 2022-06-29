package training5;

public class Palindrom {
    public static void main(String[] args) {
        String word = "водородов";
        System.out.println(word.equals(new StringBuilder(word).reverse().toString()) ? "Палиндром" : "Не палиндром");
    }
}
