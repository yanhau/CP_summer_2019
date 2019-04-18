package Shapes;

public class Triangle extends ShapeForHomework {
    private double a, b, c;

    public Triangle() {
        this(1,1,1);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
@Override
    public double perimeter() {
        return a + b + c;
    }
@Override
    public double area() {
        return (Math.sqrt(3)/4)*(a*a);
    }

}