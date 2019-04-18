package Obj;

public class Triangle_Homework {
    public static void main(String[] args) {
        double a = 5, b = 3, c = 4;
        Shape1 triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }
}
