package figure;

/**
 * У класса Прямоугольник будет два поля - ширина и высота.
 * Также необходимо реализовать конструктор, который принимает на вход
 * разномерности фигуры и цвет.
 * Реализовать два метода (area() и perimeter()).
 */
public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }
}
