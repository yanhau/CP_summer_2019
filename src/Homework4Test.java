import java.io.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Homework4Test {
    public static Double[] newColumn = new Double[63];
    public static int rownum = 0;
    public static int counter = 0;

    public static void main(String path, String fileName) throws IOException {
        String path1 = "C:/Users/Yan Hau/Dropbox/Computer Programming/Homework4.csv";
        BufferedReader br = null;
        BufferedWriter bw = null;
        final String lineSep = System.getProperty("line.separator");
        File file = new File(path1);
        Scanner inputStream = new Scanner(file);
        inputStream.next();
        while (inputStream.hasNext()) {
            String data = inputStream.next();
            String[] values = data.split(",");
            double openingPrice = parseDouble(values[1]);
            double closingPrice = parseDouble(values[2]);
/*            newColumn[rownum] = ((closingPrice - openingPrice) / openingPrice);
            rownum++;*/
            counter++;
            System.out.println(counter);

        /*try {
            File file = new File(path, fileName);
            File file2 = new File(path, fileName + ".1");


            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
            String line = null;
            int i = 0;
            for (line = br.readLine(); line != null; line = br.readLine(), i++) {

                String addedColumn = String.valueOf(data.get(i));
                bw.write(line + addedColumn + lineSep);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (br != null)
                br.close();
            if (bw != null)
                bw.close();
        }*/

        }
    }
}