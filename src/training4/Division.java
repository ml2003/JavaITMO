package training4;

import java.util.ArrayList;

public class Division {

    public ArrayList<Integer> isdivtothree(int startNumber, int endNumber) {
        ArrayList<Integer> divthree = new ArrayList<>();
        for (int i = startNumber; i < endNumber; i++) {
            if (i % 3 == 0) {
                divthree.add(i);
            }
        }
        return divthree;
    }

    public ArrayList<Integer> isdivtofive(int startNumber, int endNumber) {
        ArrayList<Integer> divfive = new ArrayList<>();
        for (int i = startNumber; i < endNumber; i++) {
            if (i % 5 == 0) {
                divfive.add(i);
            }
        }
        return divfive;
    }

    public ArrayList<Integer> isdivtothreefive(int startNumber, int endNumber) {
        ArrayList<Integer> divthreefive = new ArrayList<>();
        for (int i = startNumber; i < endNumber; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                divthreefive.add(i);
            }
        }
        return divthreefive;
    }

}
