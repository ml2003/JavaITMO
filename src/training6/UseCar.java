package training6;

public class UseCar {
    public static void main(String[] args) {
        Truck truck = new Truck(10, "Scania", 'к', 80, 10, 25);

        System.out.println(truck);
        truck.newWheels(20);
        System.out.println(truck);
    }
}
