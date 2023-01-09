package Lesson7;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        rectangle.square();
        rectangle.printSquare();
        Triangle triangle = new Triangle(5, 6, 5, 4);
        triangle.square();
        triangle.printSquare();
        Circle circle = new Circle(15);
        circle.square();
        circle.printSquare();
        Rectangle rectangle2 = new Rectangle(8, 5);
        Circle circle2 = new Circle(2);
        double sum = 0;
        System.out.println("-----------------");
        Figure[] arr = {rectangle, rectangle2, triangle, circle, circle2};
        for (int i = 0; i < arr.length; i++){
            arr[i].perimetr();
            arr[i].printPerimetr();
            sum += arr[i].perimetr;
        }
        System.out.println("Сумма периметров = " + sum);
    }
}
