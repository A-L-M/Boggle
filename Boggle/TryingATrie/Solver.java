/*****************************************
 * Thought:
 * rename Space -> Node
 * TrieNode -> Trie
 * doing so should make the graph nature
 * of the boggle board more obvious
 ****************************************/
import java.util.ArrayList;
import java.util.Stack;

public class Solver {
    TrieNode root;

    public Solver() {
    }

    /**********************************************************
     * Steps:
     * -get DFS movement through board-graph working: CHECK
     * -get word-checking against Trie working while
     *  starting at Trie root every time
     * -get Trie movement and position memory working
     * -solve 'Q' issue
     *********************************************************/
    public ArrayList<String> solve(Space space, TrieNode root) {
        Stack<Tuple> path = new Stack<>();
        path.push(new Tuple(space));
        Tuple current = path.peek();
        char[] word = new char[16];
        int wordIndex = 0;

        while (!path.isEmpty()) {
            current = path.peek();
            wordIndex = path.size() - 1;
            if (current.index >= current.space.allNeighbors().size()) {
                path.pop();
                word[wordIndex] = Character.MIN_VALUE;
                continue;
            }
            else {
                word[wordIndex] = current.space.value;
            }
            if (!contains(path, current.space.getNeighbor(current.index))) {
                path.push(new Tuple(current.space.getNeighbor(current.index)));
            }
            current.index++;
        }
        return null; //FIXME
    }

    class Tuple {
        Space space;
        private int index;
        //private boolean[] visited; //FIXME contents read but never written to?

        private Tuple(Space space) {
            this.space = space;
            index = 0;
         //   visited = new boolean[space.allNeighbors().size()]; //FIXME
        }
    }
    private boolean contains(Stack<Tuple> stack, Space space) {
        for (Tuple el : stack) {
            if (el.space == space) {
                return true;
            }
        }
        return false;
    }
}
