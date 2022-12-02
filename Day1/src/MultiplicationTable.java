import java.util.Scanner;

/*
* Объявите переменную типа int, имя переменной - k. Присвойте этой переменной
* какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while),
* выведите в консоль таблицу умножения для этой цифры
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int k = 4;
        for (int i = 1; i <= k; i++) {
            int result = i * k;
            System.out.println(i + " x " + k + " = " + result);
        }
    }
}
