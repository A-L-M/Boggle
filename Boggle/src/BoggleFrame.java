import java.io.File;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BoggleFrame extends javax.swing.JFrame
{
    private Board board;
    
    public BoggleFrame(Board board)
    {
        this.board = board;
        theHandler handler = new theHandler();
        initComponents();
        
        jButton1.addActionListener(handler);
        jButton2.addActionListener(handler);
        jButton3.addActionListener(handler);
        jButton4.addActionListener(handler);
        jButton5.addActionListener(handler);
        jButton6.addActionListener(handler);
        jButton7.addActionListener(handler);
        jButton8.addActionListener(handler);
        jButton9.addActionListener(handler);
        jButton10.addActionListener(handler);
        jButton11.addActionListener(handler);
        jButton12.addActionListener(handler);
        jButton13.addActionListener(handler);
        jButton14.addActionListener(handler);
        jButton15.addActionListener(handler);
        jButton16.addActionListener(handler);
        jButton17.addActionListener(handler);
        event d = new event();
        startButton.addActionListener(d);
        jButton19.addActionListener(handler);
        jButton20.addActionListener(handler);
        String[] wordsFound = new String[50];
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        textField1 = new java.awt.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        button1 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
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

        textField1.setText("textField1");

        jScrollPane2.setViewportView(jEditorPane1);

        jRadioButton1.setText("jRadioButton1");

        jList2.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton17.setText("WORD!");

        startButton.setText("Start");

        jButton19.setText("Reset");

        jButton20.setText("LeaderBoard");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("BOGGLE");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel<String>()
            {
                String[] strings = {"words found:"};
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            jScrollPane1.setViewportView(jList1);

            jLabel2.setText("Welcome \"Player\"");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 27));
            jLabel4.setText(new String(board.getWordBox()));

            timerLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
            timerLabel.setText("3:00");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(230, 230, 230)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton17)
                            .addGap(15, 15, 15)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startButton)
                            .addGap(20, 20, 20)
                            .addComponent(jButton19)
                            .addGap(18, 18, 18)
                            .addComponent(jButton20)))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private class theHandler implements ActionListener{
  
      public void actionPerformed(ActionEvent e){ // Handler class determines which button is pressed and what code to execute.
         if(e.getSource()==jButton1){
            board.addLetter(0, 0);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton2){
            board.addLetter(0, 1);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton3){
            board.addLetter(0, 2);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton4){
            board.addLetter(0, 3);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton5){
            board.addLetter(1, 0);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton6){
            board.addLetter(1, 1);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton7){
            board.addLetter(1, 2);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton8){
            board.addLetter(1, 3);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton9){
            board.addLetter(2, 0);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton10){
            board.addLetter(2, 1);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton11){
            board.addLetter(2, 2);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton12){
            board.addLetter(2, 3);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton13){
            board.addLetter(3, 0);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton14){
            board.addLetter(3, 1);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton15){
            board.addLetter(3, 2);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton16){
            board.addLetter(3, 3);
            //FIXME excessive new STring? memory problem maybe ? look into
            jLabel4.setText(new String(board.getWordBox()));
         }
         else if(e.getSource()==jButton17){
         }
         else if(e.getSource()==jButton19){
                   
         }
         else if(e.getSource()==jButton20){
         }        
      }           
   }
   
   public class event implements ActionListener {
      public void actionPerformed(ActionEvent d) {
         
         int count = 180;
         
         timerLabel.setText("3:00");
         File dict = new File("yawl.txt");
         Board board = new Board(dict);
         if(gamesPlayed > 1){
            gamesPlayed += 1;
            jButton1.setText("" + buttonMap(board.getNode(0,0)));
            jButton2.setText("" + buttonMap(board.getNode(0,1)));
            jButton3.setText("" + buttonMap(board.getNode(0,2)));
            jButton4.setText("" + buttonMap(board.getNode(0, 3)));
            jButton5.setText("" + buttonMap(board.getNode(1, 0)));
            jButton6.setText("" + buttonMap(board.getNode(1, 1)));
            jButton7.setText("" + buttonMap(board.getNode(1, 2)));
            jButton8.setText("" + buttonMap(board.getNode(1, 3)));
            jButton9.setText("" + buttonMap(board.getNode(2, 0)));
            jButton10.setText("" + buttonMap(board.getNode(2, 1)));
            jButton11.setText("" + buttonMap(board.getNode(2, 2)));
            jButton12.setText("" + buttonMap(board.getNode(2, 3)));
            jButton13.setText("" + buttonMap(board.getNode(3, 0)));
            jButton14.setText("" + buttonMap(board.getNode(3, 1)));
            jButton15.setText("" + buttonMap(board.getNode(3, 2)));
            jButton16.setText("" + buttonMap(board.getNode(3, 3)));
         }
            
         TimeClass tc = new TimeClass(count);
            timer = new Timer(1000, tc);
            timer.start();
         }
      }
            
      public class TimeClass implements ActionListener {
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
               else{timer.stop();}
      }
    } 
    
    private char buttonMap(Node node){
      return node.value;
    }  
    
    // Variables declaration 
    Timer timer;
    int gamesPlayed = 0;
    String playerName;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11; 
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton startButton;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.TextField textField1;

}
