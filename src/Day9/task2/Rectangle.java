package Day9.task2;

public class Rectangle extends Figure {
    private int width, length;


    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length * 2) + (width * 2);
    }
}
