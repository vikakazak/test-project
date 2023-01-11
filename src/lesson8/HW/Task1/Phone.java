package lesson8.HW.Task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String number, String model, double weight) {
        this (number, model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    void getNumber(String number){
        System.out.println("Номер: " + number);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone (){

    }
    void receiveCall(String name, String number){
        System.out.println("Звонит " + name + ", Номер: " +number);
    }
    void sendMessage(String ...msg){
        for (String a: msg){
            System.out.println("Номер: " + a);
        }
    }
}
