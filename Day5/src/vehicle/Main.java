package vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("Space Grey");
        car.setBrand("Tesla");
        System.out.println("Car info");
        System.out.println(
                "Year: " + car.getYear() +
                "\nColor: " + car.getColor() +
                "\nBrand: " + car.getBrand() + "\n"
        );
        System.out.println("Bike info");
        Motorcycle motorcycle = new Motorcycle(1995, "Red-White", "Yamaha");
        System.out.println(
                "Year: " + motorcycle.getYear() +
                        "\nColor: " + motorcycle.getColor() +
                        "\nBrand: " + motorcycle.getBrand()
        );
    }
}
