package training6;

public class Truck extends Car {
    private int wheelsCount;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int wheelsCount, int maxWeight) {
        super(w, m, c, s);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println(this.wheelsCount);
    }


    @Override
    public String toString() {
        return "Truck{" +
                "wheelsCount=" + wheelsCount +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
