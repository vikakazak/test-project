package Lesson7;

public class Rectangle extends Figure {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void square() {
        square = a * b;
    }

    @Override
    public void perimetr() {
        perimetr = (a + b) * 2;
    }
}
