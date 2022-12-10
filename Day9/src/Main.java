import human.*;

/**
 * Создайте в методе main() класса Main объект класса Студент и объект класса
 * Преподаватель. Выведите в консоль название учебной группы у объекта-студента и
 * название предмета у объекта-преподавателя. Затем, вызовите printInfo() на
 * объектах и посмотрите на результат.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Breach", "Java Dev");
        Teacher teacher = new Teacher("Kayo", "Programming language");
        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}