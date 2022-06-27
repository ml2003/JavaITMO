package training4;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        int length = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length :");

        if (scanner.hasNextInt()) {
            int l = scanner.nextInt();
            if (l > 0) {
                length = l;
            } else System.out.println("Размер не может быть меньше 1");
        } else {
            System.out.println("Введено не целое число");
        }

        if (length > 0) {
            int[] arr = new int[length];
            System.out.println("Numbers of array:");

            for (int i = 0; i < length; i++) {
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                }
            }


            System.out.println("Result : " + Arrays.toString(arr));
        }

    }
    }

