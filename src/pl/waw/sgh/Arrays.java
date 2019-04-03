package pl.waw.sgh;

public class Arrays {

    public static void main(String[] args) {
        int[] intArr = new int[5];
        // determine number of items that can be put into array, but if not enough values, 0 is returned
        // is using Integer instead of int, 0s will be returned as null
        intArr[0] = 567;
        intArr[1] = 968;
        intArr[2] = 675;

        String[] strArr = new String[]{
                "ABC",
                "DEF",
                "EFG"
        };

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(i + "th element: " + intArr[i]);
        }
        //for each loop
        for (String el : strArr) {
            System.out.println("My strArr is: " + el);
        }
        // to convert string to int
        String[] str = {"123", "345", "437", "894"};
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
    }
}
