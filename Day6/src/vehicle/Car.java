package vehicle;

/**
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference() - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства
 */
public class Car extends Vehicle {
    public Car(int year, String color, String brand) {
        super(year, color, brand);
    }

    @Override
    public void showInfo() {
        System.out.println("Это машина.");
    }

    @Override
    public int yearDifference(int year) {
        return year - this.getYear();
    }
}
