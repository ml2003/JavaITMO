package training4;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArraySort {
    public static void main(String[] args) {
      int[] arr; int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = scanner.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
