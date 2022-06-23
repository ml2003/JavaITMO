package training3;

public class Car {
    private String color;
    private String carName;
    private double weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + carName + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setCarName(String carName) {
        this.carName = carName;
    }
}
