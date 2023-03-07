package Day9.task2;

public class Triangle extends Figure {
    private double a, b, c;


    public Triangle(int length1, int length2, int length3, String color) {
        super(color);
        this.a = length1;
        this.b = length2;
        this.c = length3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        double result = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(result);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
