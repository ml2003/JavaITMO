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


        House house =new House();
        house.setAll(5, 1980, "Первый");
        House house2 = new House();
        house2.setAll(12, 1988, "Второй");

        System.out.println(house + " лет с постройки = " + house.getYearsFromBuild());
        System.out.println(house2 + " лет с постройки = " + house2.getYearsFromBuild());

    }
}
