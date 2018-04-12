/*************************************************
 * Author: Alec Mills
 *
 * processes a text file of the form:
 * one word per line
 * and removes all 2-character or less entries
 ************************************************/

import java.util.*;
import java.io.*;

public class TrimFile {

    public TrimFile() {
    }

    //returns copy a file sin-
    //all lines consisiting of fewer character than minLength
    public static File trim(String fileName, int minLength) {
        try {
            Scanner read = new Scanner(new File(fileName));
            File newFile = new File(fileName + ".trim");
            newFile.createNewFile();
            FileWriter writer = new FileWriter(newFile);

            while(read.hasNextLine()) {
                String next = read.nextLine();
                if (next.length() >= minLength) {
                    writer.write(next + "\n");
                }
            }

            return null;//FIXME;
        }
        catch (IOException e) {
            return null;
        }
    }
    public static void main(String[] args) {
        TrimFile trim = new TrimFile();
        trim.trim(args[0], 3);
    }
}
