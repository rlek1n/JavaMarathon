/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса
 * Scanner, число x. Для этого числа, по формуле выше, необходимо вычислить
 * значение y.
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод
 * nextDouble() у Scanner’а соответственно, чтобы считать из консоли число x).
 */
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numX = scanner.nextDouble();
        boolean isMoreThan4 = numX > 4;
        boolean isMoreThan5LessThanMinus3 = -3 < numX && numX < 5;
        double numY = 0;
        if (isMoreThan4) {
            numY = (numX * numX - 10) / (numX + 7);
        } else if (isMoreThan5LessThanMinus3) {
            numY = (numX + 3) * (numX * numX - 2);
        } else {
            numY = 420;
        }
        System.out.println(numY);
        scanner.close();
    }
}
