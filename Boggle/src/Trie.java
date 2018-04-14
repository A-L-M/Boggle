/*****************************
 *
 *
 ****************************/

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

    public Trie(char letter) {
        this.letter = letter;
    }

    //constructor helpers
    public Trie gen(Trie root, File file) {
        Trie current = root;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                current = root;
                String word = input.nextLine();
                for(char el : word.toCharArray()) {
                    int index = (int) el - 65;
                    if (current.hasChild(el)) {
                        current = current.getChild(el);
                    }
                    else current = current.addChild(el);
                }
                current.word = word;
            }
        }
        catch (IOException e) {
            throw new IllegalArgumentException();
        }
        return root;
    }

    public Trie addChild(char key) {
        Trie child = new Trie(key);
        int index = (int) key - 65;
        children[index] = child;
        return child;
    }

    public Trie getChild(char key) {
        return children[(int) key - 65];
    }

    public String getWord() {
        return word;
    }

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
        return "[" + letter + "]";
    }
}
