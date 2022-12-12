import warehouse.*;

/**
 * Создайте классы:
 * - “Склад” (англ. Warehouse). Поля: countOrder (количество собранных
 * заказов), balance (доход от доставленных заказов). Get и set методы для
 * обоих полей. Для получения информации о значениях полей склада
 * переопределите метод toString().
 * - “Сборщик” (англ. Picker), с полем salary, только get метод.
 * - “Курьер” (англ. Courier), с полем salary, только get метод.
 * Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором
 * необходимо объявить методы doWork() и bonus().
 * Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()), ему
 * выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
 * А также при вызове doWork() у Сборщика, происходит увеличение значения поля
 * countOrder в классе Warehouse на 1. При вызове doWork() у Курьера, происходит
 * увеличение переменной balance в классе Warehouse на 1000.
 * Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
 * отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
 * складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
 */
public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        for (int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
    }
}
