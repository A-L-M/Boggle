/*****************************************************************
 * Author: Alec Mills & Devon Lee
 *
 * Stores a word-list in a trie/prefix-tree 
 * each node in the trie represents a prefix 
 * present in the word-list
 *
 * Nodes store a char,a String value that is non-null
 * if a path beginning from root and terminating on that
 * node would result in a matching word from the word-list,
 * and an array of 26 children, each representing a letter
 * in the alphabet; null if no child exists mapped to that letter
 *****************************************************************/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Trie {
    private Trie[] children = new Trie[26];//one child per alphabet letter
    private char letter;
    public String word = null; //if word = null, no word is stored at that node.

    //root node constructor
    public Trie(File file) {
        gen(this, file);
    }

    //non-root node constructor
    public Trie(char letter) {
        this.letter = letter;
    }

    //constructor helper
    private Trie gen(Trie root, File file) {
        Trie current = root;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                current = root;
                String word = input.nextLine();
                for(char el : word.toCharArray()) {
                    int index = (int) el - 65;//translate A-Z char -> 0-25 int value
                    if (current.hasChild(el)) {
                        current = current.getChild(el);
                    }
                    else current = current.addChild(el);
                }
                current.word = word;
            }
        }
        catch (IOException e) {
            throw new IllegalArgumentException("File not found, please verify path");
        }
        return root;
    }

    //adds a child mapped to the given char key,
    //warning: overwrites current child in index if called
    //with a paramater that maps to a non-null entry in children
    public Trie addChild(char key) {
        int index = (int) key - 65; //translate A-Z char -> 0-25 int value
        Trie child = new Trie(key);
        children[index] = child;
        return child;
    }

    public Trie getChild(char key) {
        return children[(int) key - 65];//translate A-Z char -> 0-25 int value
    }

    public String getWord() {
        return word;
    }

    //returns list of children nodes that exist for this
    public ArrayList<Trie> getChildrenList() {
        ArrayList<Trie> childList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (children[i] != null) {
                childList.add(children[i]);
            }
        }
        return childList;
    }

    public boolean hasChild(char letter) {
        int index = (int) letter - 65;
        return children[index] == null ? false : true;
    }

    @Override
    public String toString() {
        return "(" + letter + ")";
    }
}
