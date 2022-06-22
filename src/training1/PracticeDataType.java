package training1;

import java.util.Scanner;

public class PracticeDataType {
    public static void  main (String[] args){

        //1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //2
        double a=(46+10)*((double)10/3);
        double b=(29)*(4)*(-15);
        System.out.println("a="+a);
        System.out.println("b="+b);

        //3
        int number=10500;
        double result = ((double)number/10)/10;
        System.out.println(result);

        //4
        result=3.6*4.1*5.9;
        System.out.println(result);

        //5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        //6
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()){
            int numb=scanner.nextInt();
            if (numb%2==0) {
                if (numb>100) {
                    System.out.println("Выход за переделы диапазона");
                }
                else {
                    System.out.println("Четное");
                }
            }
            else {
                System.out.println("Нечетное");
            }
        }
        else {
            System.out.println("Введено не целое число");
        }

        scanner.close();

    }

}