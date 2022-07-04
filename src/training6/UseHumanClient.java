package training6;

public class UseHumanClient {

    public static void main(String[] args) {
        Client client = new Client("Вас", "Иванов", "Альфа-банк");
        Employee employee = new Employee("Маша", "Машина", "Сбербанк");


        System.out.println(client.print());
        System.out.println(employee.print());

    }
}
