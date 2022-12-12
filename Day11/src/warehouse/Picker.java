package warehouse;

public class Picker implements Worker {
    private double salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setOrders(
                warehouse.getOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getOrders() >= 1500) {
            salary = salary * 3;
        }
    }

    @Override
    public String toString() {
        return "Picker {" +
                "salary=" + salary +
                '}';
    }
}
