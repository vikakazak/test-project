package Lesson6;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("5555 0000 0000 0000", 5);
        CreditCard card2 = new CreditCard("6666 0000 0000 0000", 10);
        CreditCard card3 = new CreditCard("7777 0000 0000 0000", 15);
        card1.addAmount(20);
        card2.addAmount(20);
        card3.removeAmount(5);
        card1.print();
        card2.print();
        card3.print();
    }
}
