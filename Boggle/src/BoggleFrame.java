import java.io.File;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoggleFrame extends javax.swing.JFrame
{
    private Board board;
    
    public BoggleFrame(Board board, String name) //pass it our Char array and the players name
    {
         
        this.board = board;
        this.name = name;
        initComponents(); // builds the gui, see below   
   }
    
   DefaultListModel dlm = new DefaultListModel();
   private void wordButtonActionPerformed(java.awt.event.ActionEvent evt){   // What happens when you press the word button                                            
      dlm.addElement(inputField.getText());
      wordList.setModel(dlm);
      inputField.setText("");       
   }
   private void inputFieldMouseClicked(java.awt.event.MouseEvent evt){ //Clears inputField when you click it                                         
        inputField.setText("");
      }
   private void inputFieldActionPerformed(java.awt.event.ActionEvent evt){ //What happens when you press enter(WordButton)                                                   
         dlm.addElement(inputField.getText());
         wordList.setModel(dlm);
         inputField.setText("");
      }                                   
   
   public class event implements ActionListener { // what happens when you press the start button
      public void actionPerformed(ActionEvent e) {
         
         // Populates our board.
        diceLabel1.setText("" + board.getNode(0, 0));
        diceLabel2.setText("" + board.getNode(0,1));
        diceLabel3.setText("" + board.getNode(0,2));
        diceLabel4.setText("" + board.getNode(0, 3));
        diceLabel5.setText("" + board.getNode(1, 0));
        diceLabel6.setText("" + board.getNode(1, 1));
        diceLabel7.setText("" + board.getNode(1, 2));
        diceLabel8.setText("" + board.getNode(1, 3));
        diceLabel9.setText("" + board.getNode(2, 0));
        diceLabel10.setText("" + board.getNode(2, 1));
        diceLabel11.setText("" + board.getNode(2, 2));
        diceLabel12.setText("" + board.getNode(2, 3));
        diceLabel13.setText("" + board.getNode(3, 0));
        diceLabel14.setText("" + board.getNode(3, 1));
        diceLabel15.setText("" + board.getNode(3, 2));
        diceLabel16.setText("" + board.getNode(3, 3));
        
        //builds our timer
        int count = 180;   
        timerLabel.setText("3:00");
        TimeClass tc = new TimeClass(count);
        timer = new Timer(1000, tc);
        timer.start();
        }
      }                   
            
      public class TimeClass implements ActionListener { //updates our timer on the gui.
         int counter;
         int minutes;
         int seconds;
      
         public TimeClass(int counter){
            this.counter = counter;
         }
      
         public void actionPerformed(ActionEvent tc) {
            if(counter >= 1){
               counter--;
             
               if(counter > 120){
                  minutes = 2;
                  seconds = counter - 120;
                  if(seconds < 10){
                     timerLabel.setText(minutes + ":0" + seconds);
                  }
                  else{
                     timerLabel.setText(minutes + ":" + seconds);
                  }
               }
               else if(counter == 120){
                  timerLabel.setText("2:00");
               }
               else if(counter > 60){
                  minutes = 1;
                  seconds = counter - 60;
                  if(seconds < 10){
                     timerLabel.setText(minutes + ":0" + seconds);
                  }
                  else{
                     timerLabel.setText(minutes + ":" + seconds);
                  }
               }
               else if(counter == 60){
                  timerLabel.setText("1:00");
               }
               else if(counter < 60){
                  seconds = counter;
                  if(seconds < 10){
                     timerLabel.setText("0" + seconds);
                  }
                  else{
                     timerLabel.setText("" + seconds);
                  }
              }
         }
               else{
                  timer.stop();
                  ScorePage score = new ScorePage("devon");
                  score.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  score.setVisible(true);
               }
      }
   }
    
    
    
    private void initComponents() // Mostly generated code by netbeans GUI creator, some edits done to naming, buttons, etc...
    {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        wordButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordList = new javax.swing.JList<>();
        welcomeLabel = new javax.swing.JLabel();
        diceLabel1 = new javax.swing.JLabel();
        diceLabel2 = new javax.swing.JLabel();
        diceLabel3 = new javax.swing.JLabel();
        diceLabel4 = new javax.swing.JLabel();
        diceLabel5 = new javax.swing.JLabel();
        diceLabel6 = new javax.swing.JLabel();
        diceLabel7 = new javax.swing.JLabel();
        diceLabel8 = new javax.swing.JLabel();
        diceLabel9 = new javax.swing.JLabel();
        diceLabel10 = new javax.swing.JLabel();
        diceLabel11 = new javax.swing.JLabel();
        diceLabel12 = new javax.swing.JLabel();
        diceLabel13 = new javax.swing.JLabel();
        diceLabel14 = new javax.swing.JLabel();
        diceLabel15 = new javax.swing.JLabel();
        diceLabel16 = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wordButton.setText("WORD!");
        wordButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                wordButtonActionPerformed(evt);
            }
        });


        startButton.setText("Start");
        startButton.addActionListener(e);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("BOGGLE");

        wordList.setModel(new javax.swing.AbstractListModel<String>()
            {
                String[] string = { };
                public int getSize() { return string.length; }
                public String getElementAt(int i) { return string[i]; }
            });
            jScrollPane1.setViewportView(wordList);

            welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            welcomeLabel.setText("Welcome " + name);

            diceLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel14.setBackground(new java.awt.Color(255, 255, 255));
            diceLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel15.setBackground(new java.awt.Color(255, 255, 255));
            diceLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            diceLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            diceLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(diceLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(diceLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(diceLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(diceLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap(17, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(diceLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(diceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(diceLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(diceLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diceLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diceLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diceLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diceLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );

            timerLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
            timerLabel.setText("3:00");

            inputField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
            inputField.setText("Enter words here");
            inputField.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                  inputFieldActionPerformed(evt);
                }
            });
            inputField.addMouseListener(new java.awt.event.MouseAdapter()
            {
                public void mouseClicked(java.awt.event.MouseEvent evt)
                {
                    inputFieldMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(230, 230, 230)
                                    .addComponent(titleLabel))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(wordButton)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addComponent(wordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(20, Short.MAX_VALUE))
            );

            jMenu1.setText("File");
            jMenuBar1.add(jMenu1);

            jMenu2.setText("Edit");
            jMenuBar1.add(jMenu2);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
        }// </editor-fold>  
    
    // Variables declaration 
    Timer timer;
    private int i;
    String name;
    int count = 180;
    event e = new event();
    String[] wordsFound = new String[30]; 
    private javax.swing.JButton startButton;
    private java.awt.Button button1;
    private javax.swing.JLabel diceLabel1;
    private javax.swing.JLabel diceLabel10;
    private javax.swing.JLabel diceLabel11;
    private javax.swing.JLabel diceLabel12;
    private javax.swing.JLabel diceLabel13;
    private javax.swing.JLabel diceLabel14;
    private javax.swing.JLabel diceLabel15;
    private javax.swing.JLabel diceLabel16;
    private javax.swing.JLabel diceLabel2;
    private javax.swing.JLabel diceLabel3;
    private javax.swing.JLabel diceLabel4;
    private javax.swing.JLabel diceLabel5;
    private javax.swing.JLabel diceLabel6;
    private javax.swing.JLabel diceLabel7;
    private javax.swing.JLabel diceLabel8;
    private javax.swing.JLabel diceLabel9;
    private javax.swing.JTextField inputField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JButton wordButton;
    private javax.swing.JList<String> wordList;
    // End of variables declaration        
}
