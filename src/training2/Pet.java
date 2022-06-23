package training2;

public class Pet {
    private String name;
    private PetType petType;
    private int age;
    private double weigth;

    public Pet() {
    }

    public Pet(String name, PetType petType, int age, double weigth) {
        this.name = name;
        this.petType = petType;
        this.age = age;
        this.weigth = weigth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getWeigth() {
        return weigth;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", petType=" + petType +
                ", age=" + age +
                ", weigth=" + weigth +
                '}';
    }
}
