package pl.waw.sgh;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputData {

    private static final String MYCONST_A = "a";
    private static final String MYCONST_B = "b";
    private static final String MYCONST_C = "c";

    public static void main(String[] args) {
        //MYCONST = "dgd";
        System.out.println(MYCONST_A);

        System.out.print("What's your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!name.equals("exit") && scanner.hasNext()) {
            name = scanner.next();
            System.out.println(name);
        }

        // inputting integers
        System.out.print("Your height: ");
        Integer a = scanner.nextInt();
        System.out.println("got: " + a);


        System.err.println("Error");
        System.out.println("Output");

        Logger log = Logger.getLogger("My Logger");
        log.info("My Info");
        log.fine("Fine");
        log.warning("Warning");
        log.severe("Error");
        // In practice this logger is usually replaced by
        // org.slf4j

    }
}