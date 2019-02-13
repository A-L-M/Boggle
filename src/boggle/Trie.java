package boggle;

/*****************************************************************
 * Author: Alec Mills
 *
 * Stores a word-list in a trie/prefix-tree 
 * each node in the trie represents a prefix 
 * present in the word-list
 *
 * Nodes store a char & a String value that is non-null
 * if a path beginning from root and terminating on that
 * node would result in a matching word from the word-list,
 * and an array of 26 children, each representing a letter
 * in the alphabet; null if no child exists mapped to that letter
 *****************************************************************/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Trie {
    private final Trie[] children = new Trie[26];//one child per alphabet letter
    private char letter;
    private String word = null; //if word = null, no word is stored at that node.

    //root node constructor
    public Trie(File file) {
        gen(this, file);
    }

    //non-root node constructor
    private Trie(char letter) {
        this.letter = letter;
    }

    //constructor helper
    private void gen(Trie root, File file) {
        Trie current;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                current = root;
                String word = input.nextLine();
                for (char el : word.toCharArray()) {
                    if (current.hasChild(el)) {
                        current = current.getChild(el);
                    } else current = current.addChild(el);
                }
                current.word = word;
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found, please verify path");
        }
    }

    //adds a child mapped to the given char key,
    //warning: overwrites current child in index if called
    //with a parameter that maps to a non-null entry in children
    private Trie addChild(char key) {
        int index = (int) key - 65; //translate A-Z char -> 0-25 int value
        Trie child = new Trie(key);
        children[index] = child;
        return child;
    }

    public Trie getChild(char key) {
        return children[(int) key - 65];//translate A-Z char -> 0-25 int value
    }

    public char getLetter() {
        return letter;
    }

    public String getWord() {
        return word;
    }

    public boolean hasChild(char letter) {
        int index = (int) letter - 65;
        return children[index] != null;
    }

    @Override
    public String toString() {
        return "(" + letter + ")";
    }
}
