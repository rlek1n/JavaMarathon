import java.util.Random;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 */
public class StairsArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];
        int maxSum = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
