package training6;

import java.util.Scanner;

public abstract class User {
    private String name;
    private int age;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAgeFromConsole(){
        Scanner scanner = new Scanner(System.in);
        this.age =  scanner.nextInt();
        scanner.close();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
