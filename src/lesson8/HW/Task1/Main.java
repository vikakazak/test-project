package lesson8.HW.Task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375290000001","Samsung S8",200);
        Phone phone2 = new Phone("+375290000002", "IPhone 11", 250);
        Phone phone3 = new Phone("+375290000003","IPhone 14 PRO MAX", 320);
        System.out.println("Phone1 : " + phone1.toString());
        System.out.println("Phone2 : " + phone2.toString());
        System.out.println("Phone3 : " + phone3.toString());
        System.out.println("--------");
        phone1.receiveCall("Наташа");
        phone1.getNumber("+375290000000");
        phone2.receiveCall("Мама");
        phone2.getNumber("+375291000000");
        phone3.receiveCall("Папа");
        phone3.getNumber("+375292000000");
        phone1.receiveCall("Сестра", "+375293000000");
        phone1.sendMessage("+375291379129", "+375291085555");
    }
}