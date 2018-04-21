import javax.swing.JFrame;

public class IntroPage extends javax.swing.JFrame{    
    
    
    public IntroPage(Board board){ //Constructs our intro page
      this.board = board;
      initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() //Generated code for the GUI
    {

        jPanel1 = new javax.swing.JPanel();
        playerNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rulesTextArea = new javax.swing.JTextArea();
        playButton = new javax.swing.JButton();
        rulesLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        playerNameField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerNameField.setText("Enter your name here.");
        playerNameField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playerNameFieldActionPerformed(evt);
            }
        });
        playerNameField.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                playerNameFieldMouseClicked(evt);
            }
        });

        rulesTextArea.setEditable(false); 
        rulesTextArea.setColumns(20);
        rulesTextArea.setRows(5);
        rulesTextArea.setText("You have three minutes (shown by the countdown timer)\nto find as many words as they can in the grid \naccording to the following conditions:\n\n- The letters must be adjoining in a chain. Adjacent\n  vertical, horizontal, or diaganol.\n\n- Words must be at least 3 letters long.\n\n- No letter cube may be used more than once in a \n  single word");
        jScrollPane1.setViewportView(rulesTextArea);

        playButton.setText("PLAY");;
        playButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playButtonActionPerformed(evt);
            }
        });

        rulesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rulesLabel.setText("Rules:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
                        

    public void playButtonActionPerformed(java.awt.event.ActionEvent evt){ //What happens when you press play    
        startGame();  
    }   
    
    private void playerNameFieldMouseClicked(java.awt.event.MouseEvent evt){ //What happens when you click the textField                                                 
        playerNameField.setText("");
    }                                            

    public void playerNameFieldActionPerformed(java.awt.event.ActionEvent evt)  //What happens when you press enter                                               
    {                                                    
        startGame(); 
    }  
    public void startGame(){ //Starts the boggleFrame page
      playerName = playerNameField.getText();
      BoggleFrame game = new BoggleFrame(board, playerName);                                             
      game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      game.setVisible(true); 
    }                                           

    // Variables declaration - do not modify  
    private String playerName;  
    private Board board;                 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton playButton;
    private javax.swing.JTextField playerNameField;
    private javax.swing.JLabel rulesLabel;
    private javax.swing.JTextArea rulesTextArea;
    // End of variables declaration                   
}
