package vehicle;

public abstract class Vehicle {
    private int year;
    private String color;
    private String brand;

    public Vehicle(int year, String color, String brand) {
        this.year = year;
        this.color = color;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void showInfo();

    public abstract int yearDifference(int year);
}
