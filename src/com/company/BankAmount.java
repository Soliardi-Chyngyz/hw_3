package com.company;

public class BankAmount extends Exception {
    private double amount;

    public BankAmount(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount += sum;
    }

    public void withDraw(int sum) throws Exception{

        if (sum > getAmount()) {
            throw new LimitException("У вас недостаточно средств для вывода денег!", amount);
        }
        this.amount-=sum;
    }
}
