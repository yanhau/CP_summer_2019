import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

import static java.lang.Double.parseDouble;
import static java.lang.String.valueOf;

public class Homework_4 {
    public static Double[] newColumn = new Double[63];
    public static Double[] openingPriceList = new Double[63];
    public static Double[] closingPriceList = new Double[63];
    public static int rownum = 0;

    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Yan Hau/Dropbox/Computer Programming/Homework4.csv";
        File file = new File(path);
        Scanner inputStream = new Scanner(file);
        inputStream.next();
        while (inputStream.hasNext()) {
            String data = inputStream.next();
            String[] values = data.split(",");
            double openingPrice = parseDouble(values[1]);
            double closingPrice = parseDouble(values[2]);
            openingPriceList[rownum] = openingPrice;
            closingPriceList[rownum] = closingPrice;
            newColumn[rownum] = ((closingPrice - openingPrice) / openingPrice);
            rownum++;

        }

        System.out.println(rownum);
        System.out.println(Arrays.toString(newColumn));

        String OUT_PATH = "C:/Users/Yan Hau/Dropbox/Computer Programming/Homework4A.csv";
        File outFile = new File(OUT_PATH);
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(outFile, true));
            StringBuilder sb = new StringBuilder();
            sb.append("Opening Price");
            sb.append(",");
            sb.append("Closing Price");
            sb.append(",");
            sb.append("Difference in Price");
            sb.append(",");
            sb.append("\n");
            for (int i=0;i<63;i++) {
                sb.append(String.valueOf(openingPriceList[i]));
                sb.append(",");
                sb.append(String.valueOf(closingPriceList[i]));
                sb.append(",");
                sb.append(String.valueOf(newColumn[i]));
                sb.append(",");
                sb.append("\n");
            }
            br.write(sb.toString());
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


