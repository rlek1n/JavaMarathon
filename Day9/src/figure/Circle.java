package figure;

/**
 * У класса Круг будет одно поле - радиус окружности.
 * Также необходимо реализовать конструктор, который принимает на вход
 * разномерности фигуры и цвет.
 * Реализовать два метода (area() и perimeter()).
 */
public class Circle extends Figure {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
