package boggle;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*************************************************
 * Author: Alec Mills
 *
 * processes a text file of the form:
 * one word per line
 * and removes all 2-character or less entries
 * and converts all strings to upper case
 ************************************************/
class TrimFile {

    //makes copy of a file minus
    //all lines consisting of fewer character than minLength
    private static void trim(String fileName, int minLength) {
        try {
            Scanner read = new Scanner(new File(fileName));
            File newFile = new File(fileName + ".trim");
            FileWriter writer = new FileWriter(newFile);

            while (read.hasNextLine()) {
                //upper case
                String next = read.nextLine();
                if (next.length() >= minLength) {
                    writer.write(next.toUpperCase() + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found, please correct file path");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found please correct file path");
        }
    }

    public static void main(String[] args) {
        try {
            trim(args[0], Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please specify valid file path as argument");
        }
    }
}
