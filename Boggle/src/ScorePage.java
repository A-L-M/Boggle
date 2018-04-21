import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;

public class ScorePage extends javax.swing.JFrame
{

    public ScorePage(String name, int score, Solver solver, ArrayList<String> myList)
    { 
        this.name = name;
        this.score = score;
        this.solver = solver;
        this.myList = myList;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() //Generated code for the gui
    {
        int possibleScore = solver.scoreWordList(solver.foundWords);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        playButton = new javax.swing.JButton();
        playerInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordsList = new JList(myList.toArray());
        wordsFoundLabel = new javax.swing.JLabel();
        wordsFoundLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        possibleWordList = new JList(solver.foundWords.toArray());
        possibleScoreLabel = new javax.swing.JLabel();
        percentLabel = new javax.swing.JLabel();
        percentActual = new javax.swing.JLabel();
        percentPointsLabel = new javax.swing.JLabel();
        pointsPercentActual = new javax.swing.JLabel(); 

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("Score: " + score);

        playButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playButtonActionPerformed(evt);
            }
        });

        playerInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerInput.setText(name);
        playerInput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playerInputActionPerformed(evt);
            }
        });

        wordsList.setLayoutOrientation(javax.swing.JList.VERTICAL);
        jScrollPane1.setViewportView(wordsList);
        wordsList.getAccessibleContext().setAccessibleDescription("");

        wordsFoundLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wordsFoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordsFoundLabel.setText("Words Found");
        
        wordsFoundLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wordsFoundLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordsFoundLabel1.setText("Possible Words");

        possibleWordList.setLayoutOrientation(javax.swing.JList.VERTICAL);
        jScrollPane2.setViewportView(possibleWordList);
        
        possibleScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        possibleScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        possibleScoreLabel.setText("Score: " + possibleScore);

        percentLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        percentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentLabel.setText("Percent found");

        percentActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentActual.setText("" + solver.percentOfWords(myList));//FIXME

        percentPointsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        percentPointsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentPointsLabel.setText("Points");

        pointsPercentActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pointsPercentActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pointsPercentActual.setText("" + solver.percentOfPointsEarned(score));//FIXME

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(playerInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(wordsFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(percentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentPointsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pointsPercentActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(wordsFoundLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(possibleScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wordsFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(percentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(percentActual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(percentPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(pointsPercentActual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wordsFoundLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(possibleScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerInput)
                    .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt){ //What happens you when press Play                                               
       newGame();
    }                                          

    private void playerInputActionPerformed(java.awt.event.ActionEvent evt){ //What happens you press enter                                                
       newGame();
    }  
    public void newGame(){ //Starts a new game
       name = playerInput.getText();
       Board board1 = new Board();
       solver.clearFoundWords();
       BoggleFrame newGame = new BoggleFrame(board1, name, solver);
       newGame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       newGame.setVisible(true); 
    }                                         
    // Variables declaration - do not modify
    private String name;
    private int score;
    Solver solver;
    ArrayList<String> myList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel percentActual;
    private javax.swing.JLabel percentLabel;
    private javax.swing.JLabel percentPointsLabel;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField playerInput;
    private javax.swing.JLabel pointsPercentActual;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel possibleScoreLabel;
    private javax.swing.JLabel wordsFoundLabel;
    private javax.swing.JLabel wordsFoundLabel1;
    private javax.swing.JList<String> wordsList;
    private javax.swing.JList<String> possibleWordList;
    // End of variables declaration                   
}
