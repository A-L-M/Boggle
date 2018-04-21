/*************************************************
 * Author: Alec Mills
 *
 * processes a text file of the form:
 * one word per line
 * and removes all 2-character or less entries
 * and converts all strings to upper case
 ************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TrimFile {

    //makes copy of a file minus
    //all lines consisting of fewer character than minLength
    private static void trim(String fileName, int minLength) {
        try {
            Scanner read = new Scanner(new File(fileName));
            File newFile = new File(fileName + ".trim");
            newFile.createNewFile();
            FileWriter writer = new FileWriter(newFile);

            while(read.hasNextLine()) {
                //upper case 
                String next = read.nextLine();
                if (next.length() >= minLength) {
                    writer.write(next.toUpperCase() + "\n");
                }
                /* no upper case
                String next = read.nextLine();
                if (next.length() >= minLength) {
                    writer.write(next + "\n");
                }
                */
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("please specify file path as argument");
        }
        catch (IOException e) {
            System.out.println("file not found, please correct file path");
        }
    }
    public static void main(String[] args) {
        try {
            trim(args[0], Integer.parseInt(args[1]));
        }
        catch (Exception e) {
            System.out.println("Please specify valid file path as argument");
        }
    }
}
