package vehicle;

/**
 * Создать класс Самолет (Airplane) с полями:
 * - producer (изготовитель)
 * - year (год выпуска)
 * - length (длина)
 * - weight (вес)
 * - fuel (количество топлива в баке) + геттер для этого поля
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
 * четырех полей класса (значение поля “количество топлива в баке” установить равным
 * 0). В конструкторе для передачи полям значений использовать ключевое слово this.
 * Помимо этого, в классе необходимо реализовать метод info()
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
}
