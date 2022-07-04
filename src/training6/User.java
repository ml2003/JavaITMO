package training6;

import java.util.Scanner;

public abstract class User {

    Scanner scanner = new Scanner(System.in);

    private int age;

    public void printAge() {
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFromConsole() {
        System.out.println("Введите что-то:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    public void getInfo(){
        System.out.println("Введите:");
        Integer str = scanner.nextInt();
        System.out.println(str);

    }


}
