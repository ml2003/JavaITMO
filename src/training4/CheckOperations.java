package training4;

import java.util.ArrayList;

public class CheckOperations {

    public boolean checkSum(int first, int second, int summ) {
        return first + second == summ;
    }

    public boolean checkMost(int first, int second, int third) {
        return second > first && third > second;
    }

    public boolean checkFirstLast(int num, int[] checkarray) {
        return checkarray[1] == num || checkarray[checkarray.length - 1] == num;
    }

    public boolean checkNumInArray(int num, ArrayList<Integer> checkarray) {
        return checkarray.contains(num);
    }
}
