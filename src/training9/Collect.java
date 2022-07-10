package training9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Collect {

    public static List<Integer> generateListRandom(int count) {
        List<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrlist.add((int) (Math.random() * 20000 + i));
        }
        return arrlist;
    }


    public static List<Integer> generateLinkedListRandom(int count) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add((int) (Math.random() * 20000 + i));
        }
        return linkedList;
    }


    public static void getRandom(List<Integer> list, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.get(random.nextInt(list.size()));
        }
    }


    public static void main(String[] args) {

        long timestart = System.currentTimeMillis();
        Collect.getRandom(Collect.generateListRandom(1000000), 100000);
        long timeend = System.currentTimeMillis();
        System.out.println("Для ArrayList время " + (timeend - timestart));

        timestart = System.currentTimeMillis();
        Collect.getRandom(Collect.generateLinkedListRandom(1000000), 100000);
        timeend = System.currentTimeMillis();
        System.out.println("Для LinkedList время " + (timeend - timestart));

    }
}
