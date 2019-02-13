package boggle;

import java.awt.Font;
import javax.swing.*;
import java.awt.Font;

/*****************************************************************
 * Author: Devon Lee & Alec Mills
 *
 * Handles display of introduction & rules page for Boggle
 *****************************************************************/
class IntroPage extends javax.swing.JFrame {


    // Variables declaration - do not modify
    private final Solver solver;
    private final Board board;
    private JTextField playerNameField;

    public IntroPage(Board board, Solver solver) { //Constructs our intro page
        this.board = board;
        this.solver = solver;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() //Generated code for the GUI
    {

        JPanel jPanel1 = new JPanel();
        playerNameField = new JTextField();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTextArea rulesTextArea = new JTextArea();
        JButton playButton = new JButton();
        JLabel rulesLabel = new JLabel();
        JLabel jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        playerNameField.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        playerNameField.setHorizontalAlignment(JTextField.CENTER);
        playerNameField.setText("Enter your name here.");
        playerNameField.addActionListener(evt -> playerNameFieldActionPerformed());
        playerNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerNameFieldMouseClicked();
            }
        });

        rulesTextArea.setEditable(false);
        rulesTextArea.setColumns(20);
        rulesTextArea.setRows(5);
        rulesTextArea.setText("You have three minutes (shown by the countdown timer)\n"
                + "to find as many words as they can in the grid \naccording to the following conditions:\n"
                +"\n- The letters must be adjoining in a chain. Adjacent\n  vertical, horizontal, or diagonal.\n" +
                "\n- Words must be at least 3 letters long.\n\n- No letter cube may be used more than once in a \n" +
                "single word\n\n-Special case: 'Q' always counts as 'Qu', and consequently,\n" +
                "also counts for two letters during scoring phase.\n" +
                "\n-Note: 'Q' may not be used as 'Q' rather than 'Qu'");
        jScrollPane1.setViewportView(rulesTextArea);

        playButton.setText("PLAY");
        playButton.addActionListener(evt -> playButtonActionPerformed());

        rulesLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        rulesLabel.setText("Rules:");

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOGGLE!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rulesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(playerNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(rulesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void playButtonActionPerformed() { //What happens when you press play
        startGame();
    }

    private void playerNameFieldMouseClicked() { //What happens when you click the textField
        playerNameField.setText("");
    }

    private void playerNameFieldActionPerformed()  //What happens when you press enter
    {
        startGame();
    }

    private void startGame() { //Starts the boggleFrame page
        String playerName = playerNameField.getText();
        BoggleFrame game = new BoggleFrame(board, playerName, solver);
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        game.setVisible(true);
    }
}
