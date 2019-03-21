public class WhileLoop {

    public static void main(String[] args) {

        int i = 10;
        while (i < 5) {
            System.out.println("i=" + i);
            i++;
        }

        int j = 10;
        do {
            System.out.println("j=" + j);
            j++;
        } while (j<5);
    }
}

// do-while will always execute the code once, but while alone will check the condition before executing