package training6;

import java.util.Scanner;

public abstract class Head {
    protected int number;

    public void setNumber() {

        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        this.number =  (scanner.nextInt());
        scanner.close();

    }

    public abstract int getNumber();
}
