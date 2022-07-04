package training6;

import java.util.Scanner;

public class SysUser extends User {
private String name;

    @Override
    public void getInfo() {
        String s = super.scanner.nextLine();
        System.out.println(s);
    }

    @Override
    public String getFromConsole() {
        System.out.println("Переопределенный метод");
        return "str";
    }

    public void setName() {
        this.name = super.getFromConsole();
       }

    public String getName() {
        return name;
    }
}
