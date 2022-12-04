import java.util.Scanner;

/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя
 * два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
 * результат деления и выводит его в консоль. Программа останавливает свою работу
 * тогда, когда пользователь вводит 0 в качестве делителя.
 */
public class Delimiters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 == 0) {
                break;
            }
            System.out.println(number1 / number2);
        }
    }
}
