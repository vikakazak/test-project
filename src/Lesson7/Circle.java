package Lesson7;

public class Circle extends Figure {
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * (r * r);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

