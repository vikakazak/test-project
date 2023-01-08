package Lesson6;

public class CreditCard {
    String number;
    int amount;


    public CreditCard(String number, int amount) {
        this.number = number;
        this.amount = amount;
    }

    void addAmount(int amount1) {
        amount += amount1;
    }

    void removeAmount(int amount1) {
        amount -= amount1;
    }

    void print() {
        System.out.println("Card: " + number + ", amount: " + amount);
    }
}
