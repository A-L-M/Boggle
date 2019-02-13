package boggle;


import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.util.ArrayList;

/**********************************
 * Author: Devon Lee & Alec Mills
 *
 * Handles display and calculation
 * of player-score for Boggle
 **********************************/
class ScorePage extends javax.swing.JFrame {

    private final int score;
    // Variables declaration - do not modify
    private String name;
    private final Solver solver;
    private final ArrayList<String> myList;
    private javax.swing.JTextField playerInput;

    public ScorePage(String name, int score, Solver solver, ArrayList<String> myList) {
        this.name = name;
        this.score = score;
        this.solver = solver;
        this.myList = myList;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    //Generated code for the gui
    private void initComponents()
    {
        int possibleScore = solver.scoreWordList(solver.foundWords);
        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenu1 = new JMenu();
        JMenu jMenu2 = new JMenu();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        JLabel scoreLabel = new JLabel();
        JSeparator jSeparator1 = new JSeparator();
        JButton playButton = new JButton();
        playerInput = new javax.swing.JTextField();
        JScrollPane jScrollPane1 = new JScrollPane();
        JList wordsList = new JList(myList.toArray());
        JLabel wordsFoundLabel = new JLabel();
        JLabel wordsFoundLabel1 = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        JList possibleWordList = new JList(solver.foundWords.toArray());
        JLabel possibleScoreLabel = new JLabel();
        JLabel percentLabel = new JLabel();
        JLabel percentActual = new JLabel();
        JLabel percentPointsLabel = new JLabel();
        JLabel pointsPercentActual = new JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scoreLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("Score: " + score);

        playButton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(evt -> playButtonActionPerformed());

        playerInput.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        playerInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerInput.setText(name);
        playerInput.addActionListener(evt -> playerInputActionPerformed());

        wordsList.setLayoutOrientation(javax.swing.JList.VERTICAL);
        jScrollPane1.setViewportView(wordsList);
        wordsList.getAccessibleContext().setAccessibleDescription("");

        wordsFoundLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        wordsFoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordsFoundLabel.setText("Words Found");

        wordsFoundLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        wordsFoundLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordsFoundLabel1.setText("Possible Words");

        possibleWordList.setLayoutOrientation(javax.swing.JList.VERTICAL);
        jScrollPane2.setViewportView(possibleWordList);

        possibleScoreLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        possibleScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        possibleScoreLabel.setText("Score: " + possibleScore);

        percentLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        percentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentLabel.setText("Percent found");

        percentActual.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        percentActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentActual.setText("%" + solver.percentOfWords(myList));//FIXME

        percentPointsLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        percentPointsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentPointsLabel.setText("Points");

        pointsPercentActual.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        pointsPercentActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pointsPercentActual.setText("%" + solver.percentOfPointsEarned(score));//FIXME

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(playerInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playButton, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(wordsFoundLabel, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(scoreLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(percentLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(percentActual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(percentPointsLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pointsPercentActual, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(wordsFoundLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(possibleScoreLabel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(wordsFoundLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(percentLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(percentActual, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(percentPointsLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                                .addComponent(pointsPercentActual, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(wordsFoundLabel1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(scoreLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(possibleScoreLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(playerInput)
                                        .addComponent(playButton, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addGap(48, 48, 48))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }//end NetBeans generated code

    private void playButtonActionPerformed() { //What happens you when press Play
        newGame();
    }

    private void playerInputActionPerformed() { //What happens you press enter
        newGame();
    }

    //Starts a new game
    private void newGame() {
        name = playerInput.getText();
        Board board1 = new Board();
        solver.clearFoundWords();
        BoggleFrame newGame = new BoggleFrame(board1, name, solver);
        newGame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newGame.setVisible(true);
    }
}
