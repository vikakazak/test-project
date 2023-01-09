package Lesson7;

public class Triangle extends Figure {
    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void square() {
        square = 0.5 * c * h;
    }

    @Override
    public void perimetr() {
        perimetr = a + b + c;
    }
}
