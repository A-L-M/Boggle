<<<<<<< HEAD
/****************************************
 * Author: Devon Lee & Alec Mills
 *
 * Implements GUI for Boggle game
 ****************************************/

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BoggleFrame extends javax.swing.JFrame {

    // Variables declaration
    private final Solver solver;
    private int score;
    private Timer timer;
    private final String name;
    private final event e = new event();
    private final DefaultListModel<String> dlm = new DefaultListModel<>();
    private final ArrayList<String> myList = new ArrayList<>(50);
    private final Board board;
    private JButton startButton;
    private JLabel diceLabel1;
    private JLabel diceLabel10;
    private JLabel diceLabel11;
    private JLabel diceLabel12;
    private JLabel diceLabel13;
    private JLabel diceLabel14;
    private JLabel diceLabel15;
    private JLabel diceLabel16;
    private JLabel diceLabel2;
    private JLabel diceLabel3;
    private JLabel diceLabel4;
    private JLabel diceLabel5;
    private JLabel diceLabel6;
    private JLabel diceLabel7;
    private JLabel diceLabel8;
    private JLabel diceLabel9;
    private JTextField inputField;
    private JScrollPane jScrollPane2;
    private JLabel timerLabel;
    private JList<String> wordList;
    public BoggleFrame(Board board, String name, Solver solver) { //pass it our Char array and the players name
=======
import java.awt.event.ActionEvent;//javafx? //FIXME
import java.awt.event.ActionListener;//javafx? //FIXME
import java.util.ArrayList;
import javax.swing.Timer; // do we need util instead?\
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class BoggleFrame extends javax.swing.JFrame {
    
    public BoggleFrame(Board board, String name, Solver solver){ //pass it our Char array and the players name
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
        this.board = board;
        this.name = name;
        this.solver = solver;
        solver.clearFoundWords();
<<<<<<< HEAD
        for (Node[] row : board.getBoard()) {
            for (Node el : row) {
                solver.solve(el);
            }
        }
        initComponents(); //builds the gui, see below
    }

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {
        stopGame();
    }

    private void wordButtonActionPerformed(java.awt.event.ActionEvent evt) {   // What happens when you press the word button
        wordPress();
    }

    private void inputFieldActionPerformed() { //What happens when you press enter(WordButton)
        wordPress();
    }

    private void inputFieldMouseClicked(java.awt.event.MouseEvent evt) { //Clears inputField when you click it
        inputField.setText("");
    }

    private int preventDuplicate() {
        if (myList.indexOf(inputField.getText()) >= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private void wordPress() {
        wordList.setModel(dlm);
        int points = solver.scoreWord(inputField.getText().toUpperCase());
        int points2 = preventDuplicate();
        if (points2 != 0) {
            if (points != 0) {
                dlm.addElement(inputField.getText().toUpperCase());
                score += points;
                myList.add(inputField.getText().toUpperCase());
                inputField.setText("");
            } else {
                inputField.setText("Not a valid word");
            }
        } else {
            inputField.setText("Already Entered");
        }
    }

    private void stopGame() {
        timer.stop();
        ScorePage scorePage = new ScorePage(name, score, solver, myList);
        scorePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scorePage.setVisible(true);
    }

    private void initComponents() { // Mostly generated code by NetBeans GUI creator, some edits done to naming, buttons, etc...
        JDesktopPane jDesktopPane1 = new JDesktopPane();
        JScrollBar jScrollBar1 = new JScrollBar();
        JEditorPane jEditorPane1 = new JEditorPane();
        JPanel jPanel1 = new JPanel();
        JButton wordButton = new JButton();
        startButton = new JButton();
        JButton stopButton = new JButton();
        JSeparator jSeparator1 = new JSeparator();
        JLabel titleLabel = new JLabel();
        JPanel jPanel2 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        wordList = new javax.swing.JList<>();
        JLabel welcomeLabel = new JLabel();
        diceLabel1 = new JLabel();
        diceLabel2 = new JLabel();
        diceLabel3 = new JLabel();
        diceLabel4 = new JLabel();
        diceLabel5 = new JLabel();
        diceLabel6 = new JLabel();
        diceLabel7 = new JLabel();
        diceLabel8 = new JLabel();
        diceLabel9 = new JLabel();
        diceLabel10 = new JLabel();
        diceLabel11 = new JLabel();
        diceLabel12 = new JLabel();
        diceLabel13 = new JLabel();
        diceLabel14 = new JLabel();
        diceLabel15 = new JLabel();
        diceLabel16 = new JLabel();
        timerLabel = new JLabel();
        inputField = new JTextField();
        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenu1 = new JMenu();
        JMenu jMenu2 = new JMenu();

        GroupLayout jDesktopPane1Layout = new GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
=======
        for(Node[] row: board.getBoard()){
          for(Node el: row){
            solver.solve(el);
          }
        }
        initComponents(); // builds the gui, see below   
   }
   private void stopButtonActionPerformed(java.awt.event.ActionEvent evt){
      stopGame();
   }
    
   private void wordButtonActionPerformed(java.awt.event.ActionEvent evt){   // What happens when you press the word button                                            
      wordPress();       
   }
   
   private void inputFieldActionPerformed(java.awt.event.ActionEvent evt){ //What happens when you press enter(WordButton)                                                   
      wordPress();
   }
   
   private void inputFieldMouseClicked(java.awt.event.MouseEvent evt){ //Clears inputField when you click it                                         
      inputField.setText("");
   }
   private int preventDuplicate(){
      if(myList.indexOf(inputField.getText()) >= 0){
         return 0;
      }
      else{
         return 1;
      }  
   }      
   private void wordPress(){
      wordList.setModel(dlm);
      int points = solver.scoreWord(inputField.getText().toUpperCase());
      int points2 = preventDuplicate();
      if(points2 != 0){
         if(points != 0){
            dlm.addElement(inputField.getText().toUpperCase());
            score += points;
            myList.add(inputField.getText().toUpperCase());
            inputField.setText("");
         }
         else{
            inputField.setText("Not a valid word");   
         } 
      }
      else{
         inputField.setText("Already Entered");
      }       
   }  
   
   private void stopGame(){
      timer.stop();
      ScorePage scorePage = new ScorePage(name, score, solver, myList);
      scorePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      scorePage.setVisible(true);
   }                           
   
   public class event implements ActionListener { // what happens when you press the start button
      public void actionPerformed(ActionEvent e) {
         
        inputField.setEditable(true);
        startButton.setEnabled(false); 
        
         
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
               else if(counter < 60){//FIXME condition is always true
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
                  stopGame();
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
        stopButton = new javax.swing.JButton();
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
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

<<<<<<< HEAD
        wordButton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        wordButton.setText("WORD!");
        wordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
=======
        wordButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wordButton.setText("WORD!");
        wordButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
                wordButtonActionPerformed(evt);
            }
        });


        startButton.setText("Start");
        startButton.addActionListener(e);

<<<<<<< HEAD
        titleLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        titleLabel.setText("BOGGLE");

        jScrollPane1.setViewportView(wordList);

        welcomeLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18)); // NOI18N
        welcomeLabel.setText("Welcome " + name);

        diceLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel2.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel3.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel4.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel5.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel6.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel7.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel8.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel9.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel10.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel11.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel12.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel13.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel14.setBackground(new java.awt.Color(255, 255, 255));
        diceLabel14.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel15.setBackground(new java.awt.Color(255, 255, 255));
        diceLabel15.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        diceLabel16.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24)); // NOI18N
        diceLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
=======
        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("BOGGLE");

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
            
            stopButton.setText("Stop");
            stopButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
                stopButtonActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(diceLabel9, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(diceLabel10, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(diceLabel11, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(diceLabel12, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap(17, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(diceLabel13, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel14, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel15, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel16, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(diceLabel1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(diceLabel5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel7, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(diceLabel8, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(10, 10, 10)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(diceLabel1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(diceLabel5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel7, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel8, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(diceLabel9, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel11, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel12, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(diceLabel13, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel14, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel15, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(diceLabel16, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );

        timerLabel.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 36)); // NOI18N
        timerLabel.setText("3:00");

        inputField.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 36)); // NOI18N
        inputField.setText("Enter words here");
        inputField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputFieldMouseClicked(evt);
            }
        });
        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed();
            }
        });

        stopButton.setText("Stop");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(230, 230, 230)
                                                                .addComponent(titleLabel))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(timerLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(stopButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 10, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(inputField, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(wordButton)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(timerLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(stopButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputField, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(wordButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        pack();
    }

    private class event implements ActionListener { // what happens when you press the start button
        public void actionPerformed(ActionEvent e) {

            inputField.setEditable(true);
            startButton.setEnabled(false);


            // Populates our board.
            diceLabel1.setText("" + board.getNode(0, 0));
            diceLabel2.setText("" + board.getNode(0, 1));
            diceLabel3.setText("" + board.getNode(0, 2));
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

    private class TimeClass implements ActionListener { //updates our timer on the gui.
        int counter;
        int minutes;
        int seconds;

        public TimeClass(int counter) {
            this.counter = counter;
        }

        public void actionPerformed(ActionEvent tc) {
            if (counter >= 1) {
                counter--;

                if (counter > 120) {
                    minutes = 2;
                    seconds = counter - 120;
                    if (seconds < 10) {
                        timerLabel.setText(minutes + ":0" + seconds);
                    } else {
                        timerLabel.setText(minutes + ":" + seconds);
                    }
                } else if (counter == 120) {
                    timerLabel.setText("2:00");
                } else if (counter > 60) {
                    minutes = 1;
                    seconds = counter - 60;
                    if (seconds < 10) {
                        timerLabel.setText(minutes + ":0" + seconds);
                    } else {
                        timerLabel.setText(minutes + ":" + seconds);
                    }
                } else if (counter == 60) {
                    timerLabel.setText("1:00");
                }
               /*
               else if(counter < 60){//FIXME condition is always true
                  seconds = counter;
                  if(seconds < 10){
                     timerLabel.setText("0" + seconds);
                  }
                  else{
                     timerLabel.setText("" + seconds);
                  }
              }
              */
            } else {
                stopGame();
            }
        }
    }
=======
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
            inputField.addMouseListener(new java.awt.event.MouseAdapter()
            {
                public void mouseClicked(java.awt.event.MouseEvent evt)
                {
                    inputFieldMouseClicked(evt);
                }
            });
            inputField.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    inputFieldActionPerformed(evt);
                }
            });

            stopButton.setText("Stop");

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
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 10, Short.MAX_VALUE))))
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
                            .addGap(18, 18, 18)
                            .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addComponent(wordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(20, Short.MAX_VALUE))
            );

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
    Solver solver;
    private int score;
    private Timer timer;
    private int i;
    String name;
    private int count;
    private event e = new event();
    DefaultListModel<String> dlm = new DefaultListModel<>();
    ArrayList<String> myList = new ArrayList<>(50);
    private Board board;
    private javax.swing.JButton stopButton;
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
>>>>>>> 58cfb6572160f6aeb7fdd61967192c227ddff4d0
}
