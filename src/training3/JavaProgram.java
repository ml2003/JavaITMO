package training3;

public class JavaProgram {
    public static void main (String[] args){

        Study study = new Study ("Изучение Java - это просто!");

        System.out.println(study.printCourse());

        Car car = new Car();
        car.setCarName("БМВ");
        car.setColor("черный");
        car.setWeight(2.5);

        Car car2 = new Car();
        car2.setCarName("Лада");
        car2.setColor("зеленый");
        car2.setWeight(3.4);

        Car car3 = new Car("синий");
        Car car4 = new Car("фиолетовый", 233.567);


        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

    }
}
