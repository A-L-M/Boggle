/*********************************
 * Author: Alec Mills
 *
 * Attempts to find all possible
 * valid strings in a Boggle
 * board, ie are in dictionary
 * and can be reached following
 * boggle rules
 ******************************/

import java.util.*;//FIXME

public class Solver {
    //testing whether i want validStrings to be persistent
//    ArrayList<String> validStrings;
    Board board;

    public Solver(Board board) {
        this.board = board;
        //validStrings = new ArrayList<>();
    }

    public ArrayList<String> solve(Node root) {
        int rootRow = root.getRow();
        int rootCol = root.getCol();
        ArrayList<String> validStrings = new ArrayList<>();
        Stack<Tuple> path = new Stack<>();
        Tuple current;
        StringBuilder str = new StringBuilder();

        path.push(new Tuple(root));
        str.append(path.peek().node.getChar());
        while (!path.isEmpty()) {
            current = path.peek();
            boolean inBounds = (current.index < current.visited.length);

            if (inBounds) {
                //check child node
                if (!contains(path, current.node.getChild(current.index))) {
                    path.push(new Tuple(current.node.getChild(current.index)));
                    str.append(path.peek().node.getChar());
                    if (!validStrings.contains(str.toString()) &&
                            isValid(str.toString())) {
                        String word = str.toString();
                        validStrings.add(word);
                    }
                }
                current.index += 1;
            }
            else {
                path.pop();
                str.deleteCharAt(str.length() - 1);
            }
        }
        return validStrings;//FIXME
    }

    //FIXME temporarily making public
    public boolean isValid(String word) {
        boolean valid = false;
        if (board.dictionary.get(word) == null) {
            return valid;
        }
        else if (board.dictionary.get(word) == true) {
            valid = true;
        }
        return valid;
    }

    private boolean contains(Stack<Tuple> stack, Node node) {
        for (Tuple el : stack) {
            if (el.node == node) {
                return true;
            }
        }
        return false;
    }

    //allow Stack elements pair a node and an index, without making the index
    //persistent when a stack element is popped
    class Tuple {
        private Node node;
        private int index;
        private boolean[] visited;

        private Tuple(Node node) {
            this.node = node;
            index = 0;
            visited = new boolean[node.getChildren().size()];
        }

    }
}
