package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// this code is used to create a text file (only string, if integer required then it needs to be parsed)
public class FileWrite {

    public static void main(String[] args) {
        String OUT_PATH = "C:/Users/Yan Hau/Dropbox/Computer Programming/out.csv";
        File outFile = new File(OUT_PATH);

        try {
            // Overwrite existing file or append to it by 'append' function
            FileWriter fw = new FileWriter(outFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Header of my file");
            bw.newLine();
            bw.write("23");
            bw.newLine();
            // position in the ASCII table
            bw.write(69);
            //bw.flush();
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}