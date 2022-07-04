package training6;

import java.util.Scanner;

public class UseHeadChild {
    public static void main(String[] args) {

        Child child = new Child();

        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        child.setNumber(scanner.nextInt());
        scanner.close();

        System.out.println("В объекте класса Child number = " + child.getnumber());

    }
}
