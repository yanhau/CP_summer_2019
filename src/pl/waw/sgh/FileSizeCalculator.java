package pl.waw.sgh;

import java.io.File;
import java.sql.SQLOutput;

public class FileSizeCalculator {

    public static long sumSize(File inFile) {
        long sum = 0;
        if(inFile.isDirectory()) {
            for(File f: inFile.listFiles()) {
                System.out.println(f.toString() + " " + f.length());
                //This code does not run on sub directories
                // sum += f.length();
                // but the code below allows for summing of files in sub directories
                sum += sumSize(f);
            }
        } else {
            return inFile.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        String INPUT_PATH = "C:/Users/Yan Hau/Dropbox/Computer Programming/FileSizeCalculator";
        File mypath = new File(INPUT_PATH);

        System.out.println(sumSize(mypath));
// only reads files in this folder, but does not open any other subfolders

    }
}




