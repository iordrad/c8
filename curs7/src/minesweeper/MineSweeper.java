package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MineSweeper extends JFrame {
    private JPanel gamePanel;
    private JPanel hudPanel;

    private JButton resetButton;

    private JButton[][] matrix;
    private boolean[][] minesMatrix;

    private ImageIcon smileyIcon;
    private ImageIcon sadIcon;

    private static final int[] I = {-1,-1,0,1,1,1,0,-1};
    private static final int[] J = {0,1,1,1,0,-1,-1,-1};

    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1;
    private JMenuItem mi2;




    public MineSweeper(){
        setTitle("MineSweeper game");
        initComponents();
        initMenu();

        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents(){
        gamePanel = new JPanel();

        initHudPanel();
        initGame(10,10);
        add(hudPanel,BorderLayout.NORTH);
        add(gamePanel);

    }
    private void initMenu(){
        mi1 = new JMenuItem("10*10");
        mi2 = new JMenuItem("15*15");

        mi1.addActionListener(ev->initGame(10,10));
        mi2.addActionListener(ev->initGame(15,15));
        m1 = new JMenu("Dificultati joc");

        m1.add(mi1);
        m1.add(mi2);
        mb = new JMenuBar();
        mb.add(m1);
        setJMenuBar(mb);

    }


    private void initHudPanel(){
        resetButton = new JButton();
        Image scaledImage = new ImageIcon("./src/smiley.png")
                                .getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH);
        smileyIcon = new ImageIcon(scaledImage);

        scaledImage = new ImageIcon("./src/sad.jpg")
                .getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH);
        sadIcon = new ImageIcon(scaledImage);

        resetButton.setIcon(smileyIcon);

        resetButton.addActionListener(ev -> {
            int rows = matrix.length;
            int columns = matrix[0].length;
            initGame(rows,columns);
        }
    );

        hudPanel = new JPanel();

        LayoutManager manager = new FlowLayout();
        hudPanel.setLayout(manager);
        hudPanel.add(resetButton);

    }

    private void initGame(int rows, int columns){
        matrix = new JButton[rows][columns];

        resetButton.setIcon(smileyIcon);
        gamePanel.removeAll();

        gamePanel.setLayout(new GridLayout(rows,columns));

        for(int i=0; i< rows; i++){
            for(int j=0; j< columns; j++){
                matrix[i][j] = new JButton();
                gamePanel.add(matrix[i][j]);

                int row = i;
                int column = j;
                matrix[i][j].addActionListener(ev->clickButton(row,column));
            }

        }

        gamePanel.revalidate();

        generateMines(rows, columns);
    }

    private void generateMines(int rows, int columns){
        int mines = rows*columns/6;//nr max de bombe ales de mine(una la 6 butoane)
        Random random = new Random();
        minesMatrix = new boolean[rows][columns];

        int count = 0;
        int i;
        int j;

        while(count<mines){
            i = random.nextInt(rows);//[0,n-1]
            j = random.nextInt(columns);

            if(!minesMatrix[i][j]){
                minesMatrix[i][j] = true;
                count++;
            }

        }

    }
    private void showMines(){
        int rows = matrix.length;
        int colums = matrix[0].length;

        for(int i=0; i<rows;i++){
            for(int j=0;j< colums; j++){
                if(minesMatrix[i][j]){
                    JButton button = matrix[i][j];
                    button.setBackground(Color.RED);
                }
            }
        }

    }

    private void clickButton(int i, int j){
        if(minesMatrix[i][j]){
            gameOver();
            return;
        }
        expose(i,j);
    }

    private void gameOver(){
        showMines();
        resetButton.setIcon(sadIcon);

        JOptionPane.showMessageDialog(this,"Ai pierdut jocul!");
    }
    private void expose(int i, int j){
        if(!matrix[i][j].isEnabled()){
            return;
        }
        int minesCount = countMines(i,j);
        matrix[i][j].setEnabled(false);//ca si cum as marca ca fiind vizitat
        if(minesCount!=0) {
            matrix[i][j].setText(String.valueOf(minesCount));
        }else{
            int rows = matrix.length;
            int colums = matrix[0].length;

            for(int k=0; k< I.length; k++ ){
                int newI = i+I[k];
                int newJ = j+J[k];

                if(newI<0 || newI>=rows){
                    continue;
                }
                if(newJ<0 || newJ>=colums){
                    continue;
                }
                expose(newI,newJ);
        }
    }}

    private int countMines(int i, int j){
        int rows = matrix.length;
        int colums = matrix[0].length;
        int count = 0;

        for(int k=0; k< I.length; k++ ){
                int newI = i+I[k];
                int newJ = j+J[k];

                if(newI<0 || newI>=rows){
                    continue;
                }
                if(newJ<0 || newJ>=colums){
                    continue;
                }
                if(minesMatrix[newI][newJ]){
                    count++;
                }

        }
        return count;
    }

    public static void main(String[] args) {
        new MineSweeper();
    }}



