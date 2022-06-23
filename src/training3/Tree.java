package training3;

public class Tree {
    private String name;
    private boolean isAlive;
    private int age;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, boolean isAlive, int age) {
        this.name = name;
        this.isAlive = isAlive;
        this.age = age;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                '}';
    }
}
