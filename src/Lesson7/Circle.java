package Lesson7;

public class Circle extends Figure {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void square() {
        square = Math.PI * (r * r);
    }

    @Override
    public void perimetr() {
        perimetr = 2 * Math.PI * r;
    }
}

