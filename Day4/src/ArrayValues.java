import java.util.Arrays;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено.
 */
public class ArrayValues {
    public static void main(String[] args) {
        int[] array = new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }
        for (int i : array) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
            if (i % 10 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("Массив на 100 случайных элементов:\n" + Arrays.toString(array));
        System.out.println();
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
