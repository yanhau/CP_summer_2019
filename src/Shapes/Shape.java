package pl.waw.sgh.shapes;

public abstract class Shape {

    double parA;
    double parB;

    /*    public Shape() {
        }
        */
    public Shape(double parA, double parB) {
        setParams(parA, parB);
    }

    public Shape(double parA) {
        setParams(parA, 0);
    }

    public void setParams(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public abstract double calcSurface();
// if you make a common mistake of misspelling a method name or not correctly matching the parameters,
// you will be warned that you method does not actually override as you think it does.
// Secondly, it makes your code easier to understand because it is more obvious when methods are overwritten.
    @Override
    public String toString() {
        return "Shape[parA=" + parA + ", parB=" +parB + "]";
    }
}