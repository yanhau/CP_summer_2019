import java.util.HashMap;
import java.util.Map;

public class Conditions_Advanced {
    public static void main(String[] args) {

        int a = 5;
        String astr = a>4 ? "A is greater than 4"
                : "A is not greater than 4"; // if statement is true, show first line, otherwise show second
        System.out.println(astr);

        String v = "A";

        switch (v) {
            case "A":
                System.out.println("v is A");
                break;
            case "B":
                System.out.println("v is B");
                break;
            default:
                System.out.println("V is neither A or B"); // used when there is more than 2 options
        }
        Map<String, String> myMap = new HashMap<>();
        myMap.put("A", "v is A");
        myMap.put("B", "v is B");
        myMap.put("C", "v is C");

        v = "B";
        String res = myMap.get(v);
        if (res==null) {
            System.out.println("v is not in map");
        } else {
            System.out.println(res);
        }
    }
}
