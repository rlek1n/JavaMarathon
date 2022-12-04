import java.util.Scanner;

/**
 * Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
 * делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
 * и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
 * того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
 * выводим в консоль сообщение “Деление на 0”.
 * Ключевое слово else использовать в этой программе нельзя.
 */
public class SkipIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        while (count > 0) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 == 0) {
                count--;
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(number1 / number2);
            count--;
        }
    }
}
