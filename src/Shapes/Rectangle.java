package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    public double calcSurface() {
        return parA*parB;
    }
}