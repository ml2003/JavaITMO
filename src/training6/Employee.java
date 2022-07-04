package training6;

public class Employee extends Human {
    private String bank;

    public Employee(String name, String lastName, String bank) {
        super(name, lastName);
        this.bank = bank;
    }

    @Override
    public String print() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
