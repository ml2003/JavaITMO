package training4;

import java.util.Arrays;

public class FindUniq {
    public static void main(String[] args) {
        int[] array = {-6, -6, 1, 2, 56, 56, 1, 34, 2, 20, 34};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First uniq : " + array[i]);
                break;
            }
        }

    }

}

