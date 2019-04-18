package Shapes;

public class Triangle_Homework {
    public static void main(String[] args) {
        double a = 2, b = 2, c = 2;
        ShapeForHomework Triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Perimeter: " + Triangle.perimeter()
                + "\nResulting Area: " + Triangle.area() + "\n");

    }
}
