package training4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaProgramm {
    public static void main(String[] args) {

        //4-1-1
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(i);
        }

        //4-1-2
        int from = 1;
        int to = 100;
        Division division = new Division();

        System.out.println("Делится на 3 : " + division.isdivtothree(from, to));
        System.out.println("Делится на 5 :" + division.isdivtofive(from, to));
        System.out.println("Делится на 3 и 5 :" + division.isdivtothreefive(from, to));


        //4-1-3
        CheckOperations checkOperations = new CheckOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число:");
        int num3 = scanner.nextInt();
        System.out.println("Результат : " + checkOperations.checkSum(num1, num2, num3));


        //4-1-4
        System.out.print("Введите первое число:");
        int num4 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int num5 = scanner.nextInt();
        System.out.print("Введите третье число:");
        int num6 = scanner.nextInt();
        System.out.println("Результат : " + checkOperations.checkMost(num4, num5, num6));


        //4-1-5
        int[] array = {-100, 45, 12, 5, 87, 456, 3, 1, 3};
        System.out.println("Масиив : " + Arrays.toString(array));
        System.out.println(checkOperations.checkFirstLast(3, array));

        //4-1-6
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-3, -3, 7, 4, 5, 56, 4, 3));
        System.out.println("Массив: " + arrayList);
        System.out.println(checkOperations.checkNumInArray(1, arrayList) || checkOperations.checkNumInArray(3, arrayList));


        scanner.close();
    }

}
