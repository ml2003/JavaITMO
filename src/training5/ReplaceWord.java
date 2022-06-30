package training5;

public class ReplaceWord {
    public static void main(String[] args) {
        String str = "«Мой дядя самых честных правил,\n" +
                "Когда не в шутку занемог,\n" +
                "Он уважать себя заставил\n" +
                "И лучше выдумать не мог.\n" +
                "Его пример другим наука;\n" +
                "Но, боже мой, какая бяка\n" +
                "С больным сидеть и день и ночь,\n" +
                "Не отходя ни шагу прочь!\n" +
                "Какое низкое коварство\n" +
                "Полуживого забавлять,\n" +
                "Ему подушки поправлять,\n" +
                "Печально подносить лекарство,\n" +
                "Вздыхать и думать про себя:\n" +
                "Когда же бяка возьмет тебя!»";

        //вариант 1 - метод replaceAll у String

        String censored = str.replaceAll("бяка", "[вырезанно цензурой]");
        System.out.println(censored);


        //вариант 2 - метод replace у Stringbuilder

        System.out.println(customReplaceAll(str, "бяка", "[вырезано цензурой]"));




    }

    public static String customReplaceAll(String str, String oldStr, String newStr) {

        final int strLength = str.length();
        final int oldStrLength = oldStr.length();
        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < strLength; i++) {
            int index = builder.indexOf(oldStr, i);

            if (index == -1) {
                if (i == 0) {
                    return str;
                }
                return builder.toString();
            }
            builder.replace(index, index + oldStrLength, newStr);

        }
        return builder.toString();
    }
}
