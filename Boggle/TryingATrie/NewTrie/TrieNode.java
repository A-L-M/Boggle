/*****************************
 *
 *
 ****************************/

import java .util.*;//FIXME
import java.io.*;//FIXME

public class TrieNode {
    private TrieNode[] children = new TrieNode[26];
    private char letter;
    public String word = null;

    //root node constructor
    public TrieNode(File file) {
        gen(this, file);
    }

    public TrieNode(char letter) {
        this.letter = letter;
    }

    //constructor helpers
    public TrieNode gen(TrieNode root, File file) {
        TrieNode current = root;
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

    public TrieNode addChild(char key) {
        TrieNode child = new TrieNode(key);
        int index = (int) key - 65;
        children[index] = child;
        return child;
    }

    public TrieNode getChild(char key) {
        return children[(int) key - 65];
    }

    public String getWord() {
        return word;
    }

    public ArrayList<TrieNode> getChildrenList() {
        ArrayList<TrieNode> childList = new ArrayList<>();
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

    /*FIXME
    public static void main (String[] args) {
        TrieNode root = new TrieNode();
    }
    */
}
