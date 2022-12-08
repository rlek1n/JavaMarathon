package university;

/**
 * Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
 * класс Student (Студент) с полем “Имя”.
 * Каждый класс имеет конструктор (с параметрами), set и get методы по
 * необходимости, а также у преподавателя есть метод evaluate (оценить студента),
 * принимающий в качестве аргумента студента, и работающий следующим образом:
 * внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
 * "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
 * по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 * Все слова, написанные большими буквами, должны быть заменены
 * соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
 * "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
 * значения случайного числа.
 */
public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int random = (int) (Math.random() * 4 + 2);
        String score = switch (random) {
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> "неудовлетворительно";
        };
        System.out.println(
                "Преподаватель " + getName() + " оценил студента c именем " + student.getName() +
                " по предмету " + getSubject() + " на оценку " + random + " (" + score + ").");
    }
}
