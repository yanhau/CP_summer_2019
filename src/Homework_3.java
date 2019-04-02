import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework_3 {
        public static void main(String[] args) throws IOException {
        double[][] TicTacToe = new double[3][3];
        String InputLine = "";
        int row = 0;

        String TTT = "C:/Users/Yan Hau/Dropbox/Computer Programming/TTT.csv";
        File file = new File(TTT);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            InputLine = fileScanner.nextLine();
            String[] TestArray = InputLine.split(",");

            for (int i = 0; i < TestArray.length; i++) {
                TicTacToe[row][i] = Integer.parseInt(TestArray[i]);
            }
            row++;
        }
        System.out.println(TicTacToe);
    }
}







