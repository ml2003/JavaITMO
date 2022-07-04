package training6;

public class ClientPrintImpl implements Printable {
    private String name;
    private String lastName;
    private String bank;

    public ClientPrintImpl(String name, String lastName, String bank) {
        this.name = name;
        this.lastName = lastName;
        this.bank = bank;
    }

    public void printInfo() {
        System.out.println("Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bank='" + bank + '\'' +
                '}');

    }

}
