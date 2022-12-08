import university.*;
import vehicle.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1990, "Red", "BWM");
        Motorcycle motorcycle = new Motorcycle(2000, "Black", "Yamaha");
        car.showInfo();
        motorcycle.showInfo();
        int carYearDifference = car.yearDifference(2022);
        int motoYearDifference = motorcycle.yearDifference(2024);
        System.out.println(
                "'Возраст' машины: " + carYearDifference +
                "\n'Возраст' мотоцикла: " + motoYearDifference);
        System.out.println();
        Airplane airplane = new Airplane("Pobeda", 2001, 133.4, 1131.4);
        airplane.fillUp(113.5);
        airplane.fillUp(6.5);
        airplane.info();
        System.out.println();
        Teacher teacher = new Teacher("Rick", "Math");
        Student student = new Student("Bread");
        teacher.evaluate(student);
    }
}
