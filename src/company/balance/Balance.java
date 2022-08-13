package company.balance;

import java.util.UUID;

public abstract class Balance {

    private UUID customerId;
    private double balance;

    public Balance(UUID customerId, double balance) {
        this.customerId = customerId;
        this.balance = balance;
    }

    public abstract Double addBalance(Double additionalBalance);

    public UUID getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
