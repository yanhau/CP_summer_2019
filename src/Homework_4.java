import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

import static java.lang.Double.parseDouble;
import static java.lang.String.valueOf;

public class Homework_4 {
    public static Double[] newColumn = new Double[62];
    public static int rownum = 0;

    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Yan Hau/Dropbox/Computer Programming/Homework4.csv";
        File file = new File(path);
        Scanner inputStream = new Scanner(file);
        inputStream.next();
        while (inputStream.hasNext()) {
            String data = inputStream.next();
            String[] values = data.split(",");
            double closingPrice = parseDouble(values[2]);
            double openingPrice = parseDouble(values[1]);
            newColumn[rownum] = ((closingPrice - openingPrice) / openingPrice);
            rownum++;
            System.out.println(newColumn);
            }

        }
    }


