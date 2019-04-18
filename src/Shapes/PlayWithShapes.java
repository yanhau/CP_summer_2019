package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        //Shape s1 = new Shape(5);
        //System.out.println(s1.toString());

        Rectangle r1 = new Rectangle(3,8);
        System.out.println(r1);
        System.out.println(r1.calcSurface());

        Circle c1 = new Circle(7);
        System.out.println(c1);
        System.out.println(c1.calcSurface());

        Shape s1 = r1;

        r1.calcSurface();
        //s1.calcSurface();


        //Rectangle r2 = s1;
        System.out.println();

        Rectangle r3 = r1;

        Shape[] myShapes = new Shape[3];
        myShapes[0] = r1;
        myShapes[1] = c1;
        myShapes[2] = new Rectangle(2,9);

        for (Shape s : myShapes) {
            System.out.println(s);
            System.out.println(s.calcSurface());
        }


    }
}