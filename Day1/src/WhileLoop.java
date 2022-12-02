/*
* Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя
* цикл while.
* Вывод в консоль должен быть таким:
* JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
*/
public class WhileLoop {
    public static void main(String[] args) {
        int counter = 10;
        while (counter > 0) {
            if (counter == 1) {
                System.out.print("JAVA");
            } else {
                System.out.print("JAVA ");
            }
            counter--;
        }
    }
}
