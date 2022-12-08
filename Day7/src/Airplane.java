/**
 * В классе Самолет создать статический метод compareAirplanes, который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel = 0;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println(
                "Изготовитель: " + this.producer +
                        "\nГод выпуска: " + this.year +
                        "\nДлина: " + this.length +
                        "\nВес: " + this.weight +
                        "\nКоличество топлива в баке: " + this.fuel);
    }

    public void fillUp(double fuel) {
        this.fuel += fuel;
    }

    public int compareAirplanes(Airplane airplane) {
        double thisLength = getLength();
        double airplaneLength = airplane.getLength();
        int result = 0;
        if (thisLength > airplaneLength) {
            result = 1;
        } else if (thisLength < airplaneLength) {
            result = -1;
        }
        return result;
    }
}
