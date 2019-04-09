import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Homework4Test {
    public static int[][] stocks = new int[63][4];
    public static int rownum = 0;


    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Yan Hau/Dropbox/Computer Programming/Homework4.csv";
        File file = new File(path);

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] cells = line.split(",");
            stocks[rownum][0] = Integer.parseInt(cells[0]);
            stocks[rownum][1] = Integer.parseInt(cells[1]);
            stocks[rownum][2] = Integer.parseInt(cells[2]);
            rownum++;
        }
    }
}
