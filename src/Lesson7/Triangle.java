package Lesson7;

public class Triangle extends Figure {
    private int a;
    private int b;
    private  int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        double p = perimeter();
        return Math.sqrt((p - a) * (p - b) * (p - c) * p);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
