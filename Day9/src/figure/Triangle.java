package figure;

/**
 * У класса Треугольник будет три поля - длина каждой из сторон
 * Также необходимо реализовать конструктор, который принимает на вход
 * разномерности фигуры и цвет.
 * Реализовать два метода (area() и perimeter()).
 */
public class Triangle extends Figure {
    private double width;
    private double height;
    private double length;

    public Triangle(double width, double height, double length, String color) {
        super(color);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public double area() {
        return (height * length) / 2;
    }

    @Override
    public double perimeter() {
        return width + height + length;
    }
}
