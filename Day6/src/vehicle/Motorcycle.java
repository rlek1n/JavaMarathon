package vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(int year, String color, String brand) {
        super(year, color, brand);
    }

    @Override
    public void showInfo() {
        System.out.println("Это мотоцикл.");
    }

    @Override
    public int yearDifference(int year) {
        return year - this.getYear();
    }
}