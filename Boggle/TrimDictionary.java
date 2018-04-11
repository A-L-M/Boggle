/*************************************************
 * Author: Alec Mills
 *
 * processes a text file of the form:
 * one word per line
 * and removes all 2-character or less entries
 ************************************************/

import java.util.*;
import java.io.*;

public class TrimDictionary {

    public TrimDictionary() {
    }

    //returns copy a file sin-
    //all lines consisiting of fewer character than minLength
    public static File trim(String fileName, int minLength) {
        try {
            Scanner read = new Scanner(new File(fileName));
            File newFile = new File("trimmedFile");
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
        TrimDictionary trim = new TrimDictionary();
        trim.trim("sowpods.txt", 3);
    }
}
