package vehicle;

/**
 * Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль
 */

public class Motorcycle {
    private int year;
    private String color;
    private String brand;

    public Motorcycle(int year, String color, String brand) {
        this.year = year;
        this.color = color;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
