import java.util.*;
import java.io.*;

/*********************************************
 *               TO DO:
 *
 * fix 'setChildren' family of methods
*********************************************/

public class BoggBoard {
    //fields
    private String[] dice = {"aaeegn","elrtty","aoottw","abbjoo","ehrtvw",
            "cimotu","disstty","eiosst","delrvy","achops","himnqu","eeinsu",
            "eeghnw","affkps","hlnnrz","deilrx"};
    private File dict;
    private String[] words;
    private boolean[] diceUsed = new boolean[16];
    private Node[][] board = new Node[4][4];

    //constructors
    public BoggBoard(File dict) {
        this.dict = dict;
        words = makeDict(dict);

        for (int i = 0; i < 4; i++) {
            setRow(i);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                setNodeChildren(i,j);
            }
        }
    }
    //no dictionary provided for testing purposes FIXME
    public BoggBoard() {
        dict = new File("./nursery-dict.txt");
        words = makeDict(dict);

        for (int i = 0; i < 4; i++) {
            setRow(i);
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                setNodeChildren(i,j);
            }
        }
    }

    //constructor helper methods
    private char setBoardSlot(boolean[] diceUsed) {
        Random rand = new Random();
        int toTry = rand.nextInt(16);
        if (!diceUsed[toTry]) {
            diceUsed[toTry] = true;
            return dice[toTry].charAt(rand.nextInt(6)); 
        }
        else return '0';
    }

    private void setRow(int row) {
        Random rand = new Random();
        int slotsSet = 0;

        while (slotsSet < 4) {
            char toTry = setBoardSlot(diceUsed);
            if (toTry != '0') {
                board[row][slotsSet] = new Node(toTry,row,slotsSet);
                slotsSet++;
            } 
        }
    }

    public Node getNode(int row, int col) {
        return board[row][col];
    }


    private void setNodeChildren(int row, int col) {
        int nodesSet = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                try {
                    if(!board[row][col].getChildren().contains(board[row][col])
                            && (i != row || j != col)) {
                        board[row][col].addChild(board[i][j]);
                    }
                }
                catch(ArrayIndexOutOfBoundsException e) {}
            }
        }
    }

    //getters
    private Node[][] getBoard() {
        return board;
    }

    //getting valid strings
    private ArrayList<String> dfsSearch(boolean[][] visited, int row, int col,
            Stack<Node> path) {
        ArrayList<String> validStrings = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        while (!path.isEmpty()) {
            str.append(board[row][col].getChar());
            if (checkString(words, str.toString())) {
                validStrings.add(str.toString());
            }

            path.push(board[row][col]);
            //making valid movelist for each node
            int[][] validMoves = validMoves(row,col);

            for (int[] el : validMoves) {
                if (el[0] != -1) {
                    visited[el[0]][el[1]] = true;
                    int  nextRow = board[el[0]][el[1]].getPos()[0];
                    int  nextCol = board[el[0]][el[1]].getPos()[0];
                    dfsSearch(visited, nextRow, nextCol, path);
                }
                else {
                    path.pop();
                    str.trimToSize();
                    str.deleteCharAt(str.length());
                    break;
                }
            }
        }
        return validStrings;
    }
    /*
    private ArrayList<String> dfsSearch(int row, int col) {
        boolean[][] visited = new boolean[4][4];
        int[][] validMoves = validMoves(row, col);
        Stack<Node> path = new Stack<>();
        ArrayList<String> validStrings = new ArrayList<>();
        int count = 0;
        int nextRow;
        int nextCol;

        path.push(board[row][col]);
        StringBuilder toCheck = new StringBuilder();
        while (!path.empty()) {
            toCheck.append(path.peek().getChar());
            if (checkString(words, toCheck.toString())) {
                validStrings.add(toCheck.toString());
            }
            while (validMoves[count][0] != -1) {
                nextRow = validMoves[count][0];
                nextCol = validMoves[count][1];
                if (!visited[nextRow][nextCol]) {
                    path.push(board[nextRow][nextCol].getNextChild());
                    if (path.peek().hasNextChild()) {
                        count++;
                        dfsSearch(path.peek().getPos()[0],
                                path.peek().getPos()[1]);

                    }
                    else {
                        path.pop();
                    }
                }
            }
        } 
        return validStrings;
    }
    */

    private String[] makeDict(File file) {
        String[] dict = new String[99171];

        try {
            Scanner scan = new Scanner(file);
            int i = 0;
            while(scan.hasNextLine()) {
                dict[i] = scan.nextLine();            
                i++;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Oops! No dictionary found, Please provide one");
        }
        return dict;
    }

    private boolean checkString(String[] words, String guess) {
        return Arrays.binarySearch(words, guess) >= 0;
    }

    private int[][] validMoves(int row, int col) { 
        int[][] validMoves = new int[8][2];
        int[] rowRange = {row - 1, row + 1};
        int[] colRange = {col - 1, col + 1};
        int num = 0;
        //filling with -1 so other methods can distinguish between valid moves of [0][0]
        //and an empty slot in validMoves 
        for (int[] el : validMoves) {
            Arrays.fill(el, -1);
        }

        for (int i = rowRange[0]; i <= rowRange[1]; i++) {
            for (int j = colRange[0]; j <= colRange[1]; j++) {
                boolean inBounds = (i >= 0 && i <= 3) && (j >= 0 && j <= 3);
                if (inBounds && (i != row || j != col)) {
                    validMoves[num][0] = i;
                    validMoves[num][1] = j;
                    num++;
                }
            }
        }
        return validMoves;
    }
    

    //debugging
    private void print() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + board[i][j].getChar() + "]");
                if (j % 3 == 0 && j != 0) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        File dict = new File("words");
        BoggBoard board = new BoggBoard(dict);
        board.print();
        System.out.println();
        for (Node[] row : board.getBoard()) {
            for (Node node : row) {
                System.out.print(node.toString() + "::");
                for (Node child : node.getChildren()) {
                    System.out.print(child.toString() + " ");
                }
                System.out.println(); //formatting
            }
        }
        //testing validMoves()
        for (int[] row : board.validMoves(0,0)) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        //visiting children
        for (Node[] row : board.getBoard()) {
            for (Node node : row) {
                node.visitChild(node.getChildren().get(0));
            }
        }
        //testing unvisited function
        System.out.println("\n\nUnvisited: \n\n"); //debugging
        for (Node[] row : board.getBoard()) {
            for (Node node : row) {
                for (Node child : node.unvisitedChildren()) {
                    System.out.println(child.toString());
                }
                System.out.println(); //formatting
            }
        }
        //testing DFS
        Stack<Node> path = new Stack<>();
        path.push(board.getNode(0,0));
        boolean[][] visited = new boolean[4][4];
        for (String el : board.dfsSearch(visited, 0, 0, path)) {
            System.out.print(el);
        }
    }

}
