/*****************************
 *
 *
 ****************************/

import java .util.*;//FIXME
import java.io.*;//FIXME

public class TrieNode {
    private Hashtable<Character,TrieNode> children;
    private char letter;
    private boolean isWord;

    //root node constructor
    public TrieNode() {
        children = new Hashtable<>(26);
        testConst(this);
    }

    public TrieNode(char letter) {
        children = new Hashtable<>();
        this.letter = letter;
    }

    public TrieNode addChild(char key) {
        TrieNode child = new TrieNode(key);
        children.put(key, child); 
        return child;
    }

    public TrieNode getChild(char key) {
        return children.get(key);
    }

    public boolean isWord() {
        return isWord;
    }

    public ArrayList<TrieNode> getChildrenList() {
        ArrayList<TrieNode> childList = new ArrayList<>();
        for (int i = 65; i < 90; i++) {
            char letter = (char) i;
            if (children.get(letter) != null) {
                childList.add(children.get(letter));
            }
        }
        return childList;
    }

    @Override
    public String toString() {
        return "[" + letter + "]";
    }

    private static TrieNode testConst(TrieNode root) {
        TrieNode current = root;
        try {
            File file = new File("nursery-dict.txt.trim");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String word = input.nextLine();
                current = root;
                for(char el : word.toCharArray()) {
                    if (current.getChild(el) != null) {
                        current = current.getChild(el);
                    }
                    else {
                        current = current.addChild(el);
                        //FIXME debugging
                        //System.out.print(current.letter);
                    }
                }
                current.isWord = true;
            }
        }
        catch (IOException e) {
            //FIXME
        }
        return root;
    }

    public static void main (String[] args) {
        TrieNode root = new TrieNode();
        TrieNode.testConst(root);
        Scanner scanner = new Scanner(System.in);

        TrieNode current = root;
        /*
        while(!current.isWord) {
            System.out.print("Found: ");
            current = current.getChild(scanner.nextLine().charAt(0));
            System.out.println(current);
        }
        while (!current.isWord) {
            for (TrieNode el: current.getChildren()) {
                System.out.print("Children of: " + current + " " + el);
            }
        }
        */
    }
}
