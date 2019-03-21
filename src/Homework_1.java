public class Homework_1 {
    public static void main(String[] args) {
        String[] email = {"cp@gmail.com", "cpsummer@gmail.com", "nil"};
        for (String i : email) {
            if (i.indexOf("@") > -1 && i.indexOf(".com") > -1) {
                System.out.println("The Email " + i + " is valid");
            }
            else {
                System.out.println("The Email " + i + " is Invalid");
            }
            }

    }
}
