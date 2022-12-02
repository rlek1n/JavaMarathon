/*
 * Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя
 * цикл for.
 * Вывод в консоль должен быть таким:
 * JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print("JAVA");
            } else {
                System.out.print("JAVA ");
            }
        }
    }
}
