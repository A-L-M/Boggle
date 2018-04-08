/*************************
 * Testing an idea for
 * Boggle word validation
 *
 * Search list of String
 * for a given String
 ************************/

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.TreeSet;

public class WordSearch {
    public static void main(String[] args) {
        //getting word file
        File dict = new File("words");
        Scanner scanner;
        
        try {
            scanner = new Scanner(dict);
        }
        catch (IOException e) {
            System.out.println("Oops! You're missing parts! Please redownload" +
                    " the application.");
            scanner = new Scanner(System.in);//there must be a better way than this. . . FIXME
        }

        //trying out TreeSet
        TreeSet<String> words = new TreeSet<>();
        int i=  0;
        while(scanner.hasNextLine()) {
            words.add(scanner.nextLine());
            i++;
        }

        //getting words into array so we can take advantage of java.util.Arrays;
        /*
        String[] words = new String[99171];
        int i = 0;
        while(scanner.hasNextLine()) {
            words[i] = scanner.nextLine();
            i++;
        }
        scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        if(Arrays.binarySearch(words, word) >= 0){
            System.out.println("found \"" + word + "\"");
        }
        */
    }
}
