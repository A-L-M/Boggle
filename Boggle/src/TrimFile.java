/*************************************************
<<<<<<< HEAD
 * Author: Alec Mills & Devon Lee
=======
 * Author: Alec Mills
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
 *
 * processes a text file of the form:
 * one word per line
 * and removes all 2-character or less entries
 * and converts all strings to upper case
 ************************************************/

<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
=======
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0

public class TrimFile {

    //makes copy of a file minus
    //all lines consisting of fewer character than minLength
    private static void trim(String fileName, int minLength) {
        try {
            Scanner read = new Scanner(new File(fileName));
            File newFile = new File(fileName + ".trim");
<<<<<<< HEAD
            FileWriter writer = new FileWriter(newFile);

            while (read.hasNextLine()) {
                //upper case
=======
            newFile.createNewFile();
            FileWriter writer = new FileWriter(newFile);

            while(read.hasNextLine()) {
                //upper case 
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
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
<<<<<<< HEAD
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
=======
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
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
            System.out.println("Please specify valid file path as argument");
        }
    }
}
