/*****************************************
 * Thought:
 * rename Space -> Node
 * TrieNode -> Trie
 * doing so should make the graph nature
 * of the boggle board more obvious
 * Also:
 * Comment your code numbnuts!
 ****************************************/

import java.util.ArrayList;
import java.util.Stack;

public class Solver {

    public ArrayList<String> foundWords = new ArrayList<>();
    private boolean[][] visited = new boolean[4][4];
    Stack<Tuple> path = new Stack<>();

    public Solver() {
    }

    class Tuple {
        private Node node;
        private Trie trie;
        private int index = 0;
        private int row;
        private int col;

        public Tuple(Node node, Trie trie) {
            this.node = node;
            this.trie = trie;
            this.row = node.getRow();
            this.col = node.getCol();
        }
    }

    //later make sure word is > 3 chars
    public void solve(Node node, Trie root) {
        Node child;
        Tuple current = path.push(new Tuple(node, root.getChild(node.value)));
        while (!path.isEmpty()) {
            current = path.peek();
            String word = current.trie.getWord();
            if (word != null && foundWords.indexOf(word) < 0) {
                foundWords.add(word);
            }
            boolean inBounds = current.index >= 0 && 
                    current.index < current.node.allNeighbors().size();
            if (!inBounds) {
                path.pop();
                continue;
            }
            else {
                child = current.node.getNeighbor(current.index);
            }

            if (!inStack(child)) {
                if (!current.trie.hasChild(child.value)) {
                    path.pop();
                    continue;
                }

                path.push(new Tuple(child, current.trie.getChild(child.value)));

            }

            current.index++;
        }

    }

    private boolean inStack (Node node) {
        for (Tuple el : path) {
            if (el.node == node) return true;
        }
        return false;
    }
}
