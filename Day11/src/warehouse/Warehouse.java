package warehouse;

public class Warehouse {
    private int orders;
    private double balance;

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse {" +
                "orders=" + orders +
                ", balance=" + balance +
                '}';
    }
}
