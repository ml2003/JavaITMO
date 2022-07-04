package training6;

public class Client extends Human{
    private String bank;


    public Client(String name, String lastName, String bank) {
        super(name, lastName);
        this.bank = bank;
    }

    @Override
    public String print() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bank='" + bank + '\'' +
              '}';

    }

}
