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
        private Space space;
        private TrieNode node;
        private int index = 0;
        private int row;
        private int col;

        public Tuple(Space space, TrieNode node) {
            this.space = space;
            this.node = node;
            this.row = space.getRow();
            this.col = space.getCol();
        }
    }

    //later make sure word is > 3 chars
    public void solve(Space space, TrieNode root) {
        Space child;
        Tuple current = path.push(new Tuple(space, root.getChild(space.value)));
        while (!path.isEmpty()) {
            current = path.peek();
            String word = current.node.getWord();
            if (word != null && foundWords.indexOf(word) < 0) {
                foundWords.add(word);
            }
            boolean inBounds = current.index >= 0 && 
                    current.index < current.space.allNeighbors().size();
            if (!inBounds) {
                path.pop();
                continue;
            }
            else {
                child = current.space.getNeighbor(current.index);
            }

            if (!inStack(child)) {
                if (!current.node.hasChild(child.value)) {
                    path.pop();
                    continue;
                }

                path.push(new Tuple(child, current.node.getChild(child.value)));

            }

            current.index++;
        }

    }

    private boolean inStack (Space space) {
        for (Tuple el : path) {
            if (el.space == space) return true;
        }
        return false;
    }
}
