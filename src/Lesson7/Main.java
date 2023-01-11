package Lesson7;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        Triangle triangle = new Triangle(5, 6, 5);
        Circle circle = new Circle(15);
        Rectangle rectangle2 = new Rectangle(8, 5);
        Circle circle2 = new Circle(2);
        double sum = 0;
        Figure[] arr = {rectangle, rectangle2, triangle, circle, circle2};
        for (int i = 0; i < arr.length; i++){
            sum += arr[i].perimeter();
        }
        System.out.println("Сумма периметров = " + sum);
    }
}
