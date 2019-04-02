import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) throws IOException {
        String TTT = "C:/Users/Yan Hau/Dropbox/Computer Programming/TTT.csv";
        File file = new File(TTT);

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String game = fileScanner.nextLine();
            System.out.println(game);
        }
    }
}

