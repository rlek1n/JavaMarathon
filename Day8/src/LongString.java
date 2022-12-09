/**
 * Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
 * строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
 * (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 */
public class LongString {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            if (i != 20000) {
                string.append(i).append(" ");
            } else {
                string.append(i);
            }
        }
        System.out.println(string);
    }
}