public class Blocks {
    public static void main(String[] args) {
        int a = 5;
        {
            int b = 7;
            System.out.println(a);
            System.out.println(b);
            {
                int c = 7;
                System.out.println(a);
                System.out.println(b);
            }
            System.out.println(c);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
// Since the values are defined in a block, it is only available in that block ,thus it can't be read