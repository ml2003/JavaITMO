package training5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLengthString {
    public static void main(String[] args) {
        String str = "«Мой дядя самых честных правил,\n" +
                "Когда не в шутку занемог,\n" +
                "Он уважать себя заставил\n" +
                "И лучше выдумать не мог.\n" +
                "Его пример другим наука;\n" +
                "Но, боже мой, какая скука\n" +
                "С больным сидеть и день и ночь,\n" +
                "Не отходя ни шагу прочь!\n" +
                "Какое низкое коварство\n" +
                "Полуживого забавлять,\n" +
                "Ему подушки поправлять,\n" +
                "Печально подносить лекарство,\n" +
                "Вздыхать и думать про себя:\n" +
                "Когда же черт возьмет тебя!»";


        String[] strings = str.split("«|\n|,| |!");

        int maxlength = 0;

        for (String s : strings) {
            if (s.length() > maxlength) maxlength = s.length();
        }
        for (String s : strings) {
            if (s.length() == maxlength) System.out.println(s);
        }


    }

}
