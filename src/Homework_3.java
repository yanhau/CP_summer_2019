import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) throws IOException {
    int[][] board = new int[3][3];
    int row = 0;
    String path = "C:/Users/Yan Hau/Dropbox/Computer Programming/TTT.csv";
    File file = new File(path);

    Scanner fileScanner = new Scanner(file);
    while (fileScanner.hasNext()) {
        String line = fileScanner.nextLine();
        String[] cells = line.split(",");
        System.out.println(cells[0]);
        System.out.println(line);
    }
    }
}








