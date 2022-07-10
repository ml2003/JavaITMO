package training9;

import java.util.*;

public class Uniq {


    public static List<String> createList() {
        List<String> arrlist = new ArrayList<>();

        arrlist.add("First");
        arrlist.add("Second");
        arrlist.add("First");
        arrlist.add("Third");
        arrlist.add("First");
        arrlist.add("Third");
        return arrlist;
    }

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(createList());

        for (String item : set) {
            System.out.println(item);
        }
    }
}
