public class Numbers {

    public static void main(String[] args) {
        float f1 = 455.3f;
        double d1 = f1;
        // float f2 = d1;
        int a = 6;
        long b = a;
        int c = Long.valueOf(b).intValue(); // Long is to represent b as an object from a primitive type
        Long bb = Long.valueOf(a);
        int cc = bb.intValue();

        int i = 0;
        i++; // i = i + 1;
        i--; // i = i - 1;
        i = 8;
        a = i++;
        System.out.println(a);
        i = 8;
        a = ++i;
        System.out.println(a);

        double res = Math.pow(Math.PI, 2);
        // to the power of 2
        System.out.println(res);
        System.out.println(i);

        // the rest of division by 7
        a = i % 7;

    }
}
