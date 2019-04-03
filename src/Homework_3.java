import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Homework_3 {
    public static int[][] arr = new int[3][3];


    public static void main(String[] args) throws IOException {
    int[][] arr = new int[3][3];
    String path = "C:/Users/Yan Hau/Dropbox/Computer Programming/TTT.csv";
    File file = new File(path);

    Scanner fileScanner = new Scanner(file);
    while (fileScanner.hasNext()) {
        String line = fileScanner.nextLine();
        String[] cells = line.split(",");
        for (int i=0; i<3 ; i++) {
            for (int j=0; j<3; j++) {
                arr[j][i] = Integer.parseInt(cells[j]);
            }
        }
        System.out.println(arr);
        System.out.println(line);
    }
    if(// checking for horizontal victory
            arr[0][0]+arr[0][1]+arr[0][2] ||
            arr[1][0]+arr[1][1]+arr[1][2] ||
            arr[2][0]+arr[2][1]+arr[2][2] ||
       // checking for vertical victory
            arr[0][0]+arr[1][0]+arr[2][0] ||
            arr[0][1]+arr[1][1]+arr[2][1] ||
            arr[0][2]+arr[1][2]+arr[2][2] ||
       // checking for diagonal victory
            arr[0][0]+arr[1][1]+arr[2][2] ||
            arr[2][0]+arr[1][1]+arr[0][2] ||
                    == 3) {
            System.out.println("Player O has won");
        }else if(
                arr[0][0]+arr[0][1]+arr[0][2] ||
                arr[1][0]+arr[1][1]+arr[1][2] ||
                arr[2][0]+arr[2][1]+arr[2][2] ||

                arr[0][0]+arr[1][0]+arr[2][0] ||
                arr[0][1]+arr[1][1]+arr[2][1] ||
                arr[0][2]+arr[1][2]+arr[2][2] ||

                arr[0][0]+arr[1][1]+arr[2][2] ||
                arr[2][0]+arr[1][1]+arr[0][2] ||
                    == -3) {
            System.out.println("Player X has won");
        } else {
            System.out.println("The game has ended in a draw");
        }
    }
}








