/*********************************
 * Author: Alec Mills
 *
 * Attempts to find all possible
 * valid strings in a Boggle
 * board, ie are in dictionary
 * and can be reached following
 * boggle rules
 ******************************/

import java.util.ArrayList;
import java.util.Stack;

public class Solver {
    Board board;

    public Solver(Board board) {
        this.board = board;
    }

    public ArrayList<String> solve(Node root) {
        int rootRow = root.getRow();
        int rootCol = root.getCol();
        ArrayList<String> validStrings = new ArrayList<>(200);//roughly avg final size=200
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

                    if (validStrings.indexOf(str.toString()) < 0 &&
                            isValid(str)) {
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
        return validStrings;
    }

    private boolean isValid(StringBuilder word) {
        boolean valid = false;
        //dealing with Q = Qu issue
        /*********************************
         * Cases:
         * -Q exists and U has not been inserted, and Q is not at the end of the word
         * -Q exists, U has already been inserted
         * -Q exists, it's at the end of the string so index error if use + 1, need to append
         *  FIRST SOLVE FINDING Q, THEN DECIDE IF FINDING WORDS LIKE QAT IS WORTH IT
         ********************************/
        if (word.indexOf("Q") > -1) {
            int qIndex = word.indexOf("Q");
            boolean isEnd = qIndex == word.length() - 1;
            if (isEnd) {
                word.append('U');
            }
            else if (word.charAt(qIndex + 1) != 'U') {
                word.insert(qIndex + 1, "U");
            }
            /*
            boolean inBounds = (word.indexOf("Q") >=0 &&
                    word.indexOf("Q") < word.length());
            if (inBounds && word.charAt(word.indexOf("Q") + 1) != 'U') {
                word.insert(word.indexOf("Q") + 1, "U");
            }
            */
        }

        if (board.dictionary.get(word.toString()) == null) {
            return valid;
        }
        //FIXME next 4 lines replaced with just return true?
        else if (board.dictionary.get(word.toString()) == true) {
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
