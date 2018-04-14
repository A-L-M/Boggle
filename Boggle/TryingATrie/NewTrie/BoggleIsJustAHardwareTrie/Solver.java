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
        //TrieNode node = root.getChild(space.value);//FIXME
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
                //path.push(new Tuple(child, node.getChild(child.value)));

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
    /**********************************************************
     * Steps:
     * -get DFS movement through board-graph working: CHECK
     * -get word-checking against Trie working while
     *  starting at Trie root every time
     * -get Trie movement and position memory working
     * -solve 'Q' issue
     *********************************************************/
    /* Stack attempt
    public ArrayList<String> solve(Space space, TrieNode root) {
        ArrayList<String> validStrings = new ArrayList<>();
        Stack<Tuple> path = new Stack<>();
        path.push(new Tuple(space));
        Tuple current = path.peek();
        TrieNode node = root;
        char[] word = new char[16];
        int wordIndex = 0;

        while (!path.isEmpty()) {
            current = path.peek();
            wordIndex = path.size() - 1;
            if (node.getChild(current.space.value) != null &&
                    !contains(path, current.space.getNeighbor(current.space.value))) {
                node = node.getChild(current.space.value);
            }
            else if(contains(path, current.space.getNeighbor(current.space.value))) {
                current.index++;
            }
            else { //FIXME code rep
                path.pop();
                word[wordIndex] = Character.MIN_VALUE;
                continue;
            }
            if (node.getWord() != null && node.getWord().length() > 2) {
                validStrings.add(node.getWord());
            }
            if (node == null || current.index >= //FIXME code rep
                    current.space.allNeighbors().size()) {
                path.pop();
                word[wordIndex] = Character.MIN_VALUE;
                continue;
            }
            if (!contains(path, current.space.getNeighbor(current.index))) {
                path.push(new Tuple(current.space.getNeighbor(current.index)));
                word[wordIndex] = current.space.value;
            }
            current.index++;
        }
        return validStrings; //FIXME
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
    */
}
