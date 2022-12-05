import java.util.Arrays;
import java.util.Scanner;

/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class ArrayLen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int moreThan8 = 0;
        int equals1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        for (int i : array) {
            if (i > 8) {
                moreThan8++;
            }
            if (i == 1) {
                equals1++;
            }
            if (i % 2 == 0) {
                evenNumbers++;
            }
            if (i % 2 != 0) {
                oddNumbers++;
            }
            sum += i;
        }
        System.out.println("Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreThan8);
        System.out.println("Количество чисел равных 1: " + equals1);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);
        scanner.close();
    }
}