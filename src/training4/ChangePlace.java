package training4;

import java.util.Arrays;

public class ChangePlace {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 56, 98, 65, 78, 54};

        System.out.println(Arrays.toString(array));

        int b = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = b;

        System.out.println(Arrays.toString(array));

    }

}
