package pl.waw.sgh;

public class Blocks {
    //
    public static int d = 6;

    public static void myProcedure() {
        System.out.println(d);
        //System.out.println(a);
    }

    public static int myFunc(int d) {
        return d*10;
    }

    public static void main(String[] args) {
        int a = 5;
        myProcedure();
        System.out.println(myFunc(7));
        //System.out.println(d);
        {
            int b = 7;
            System.out.println(a);
            System.out.println(b);
            {
                int c = 7;
                System.out.println(a);
                System.out.println(b);
            }
            //System.out.println(c);
        }
        System.out.println(a);
        //System.out.println(b);
    }
}
// Since the values are defined in a block, it is only available in that block ,thus it can't be read
// Private means that the info in this class is only available here, by not putting anything it allows the data to be read
// amongst all files in the same package. If public, it can be read everywhere