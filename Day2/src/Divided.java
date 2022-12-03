/**
 * Есть два числа, которые задаются пользователем через консоль (назовем эти два
 * числа a и b). Используя цикл for, вывести все числа из диапазона между a и b,
 * которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.
 * Например, число 15 подходит под наше условие (делится на 5 без остатка и не
 * делится на 10 без остатка), но число 20 не подходит под наше условие (делится на 5
 * без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
 * Если a >= b вывести сообщение "Некорректный ввод"
 */
import java.util.Scanner;

public class Divided {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        if (numA >= numB) {
            System.out.println("Некорректный ввод");
        }
        System.out.print("For Loop: ");
        for (int i = numA; i <= numB; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("While Loop: ");
        while (numA <= numB) {
            if ((numA % 5 == 0) && (numA % 10 != 0)) {
                System.out.print(numA + " ");
            }
            numA++;
        }
        scan.close();
    }
}
