import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Homework_3 {
    public static int[][] arr = new int[3][3];
    public static int rownum = 0;


    public static void main(String[] args) throws IOException {
    String path = "C:/Users/Yan Hau/Dropbox/Computer Programming/TTT.csv";
    File file = new File(path);

    Scanner fileScanner = new Scanner(file);
    while (fileScanner.hasNext()) {
        String line = fileScanner.nextLine();
        String[] cells = line.split(",");
        arr[rownum][0] = Integer.parseInt(cells[0]);
        arr[rownum][1] = Integer.parseInt(cells[1]);
        arr[rownum][2] = Integer.parseInt(cells[2]);
        rownum++;
            }
        System.out.println(arr[1]);
        if(// checking for horizontal victory
                        (arr[0][0]+arr[0][1]+arr[0][2]) == 3 ||
                        (arr[1][0]+arr[1][1]+arr[1][2]) == 3 ||
                        (arr[2][0]+arr[2][1]+arr[2][2]) == 3 ||
           // checking for vertical victory
                        (arr[0][0]+arr[1][0]+arr[2][0]) == 3 ||
                        (arr[0][1]+arr[1][1]+arr[2][1]) == 3 ||
                        (arr[0][2]+arr[1][2]+arr[2][2]) == 3 ||
           // checking for diagonal victory
                        (arr[0][0]+arr[1][1]+arr[2][2]) == 3 ||
                        (arr[2][0]+arr[1][1]+arr[0][2]) == 3) {
            System.out.println("Player O has won");
        }else if(
                        (arr[0][0]+arr[0][1]+arr[0][2]) == -3 ||
                        (arr[1][0]+arr[1][1]+arr[1][2]) == -3 ||
                        (arr[2][0]+arr[2][1]+arr[2][2]) == -3 ||

                        (arr[0][0]+arr[1][0]+arr[2][0]) == -3 ||
                        (arr[0][1]+arr[1][1]+arr[2][1]) == -3 ||
                        (arr[0][2]+arr[1][2]+arr[2][2]) == -3 ||

                        (arr[0][0]+arr[1][1]+arr[2][2]) ==-3 ||
                        (arr[2][0]+arr[1][1]+arr[0][2])  == -3) {
            System.out.println("Player X has won");
        } else {
            System.out.println("The game has ended in a draw");
        }
    }
}












