package training7;

public class Plane {
    private String name;
    private Wing wing;

    public Plane(String name, int w) {
        this.name = name;
        wing = new Wing();
        this.wing.setWeight(w);
    }

    public void planeInfo() {
        System.out.println(this.name);
        this.wing.showWeight();

    }


    public class Wing {
        private int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла : " + this.weight);
        }
    }

}
