import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class BoardDesign {
    
    JFrame player1, player2, midField;
    JPanel contentPane1, contentPane2, contentPane3;
    JButton roll1, roll2, dice1, dice2,dice3, dice4, dice5;
    JLabel die1,die2,die3, die4, die5;
    String[] categories = new String[] {"Ones", "Twos", "Threes", "Fours", "Fives", "Sixes", "Bonus", "Three of a Kind", "Four of a Kind", "Small Straight", "Large Straight", "Full House", "Yahtzee", "Chance", "Sum"};
    
    public BoardDesign() {
    
        contentPane1 = new JPanel();
        contentPane2 = new JPanel();
        contentPane3 = new JPanel();
        
        // Layout for Player 1
        contentPane1.setLayout(new GridLayout(15, 2, 5, 5)); 
        int count = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 1) {
                contentPane1.add(new JLabel(categories[count]));
                count++;
            } else {
                contentPane1.add(new JLabel("00"));
            }
            
        }
        
        // Layout for Game Board
        contentPane3.setLayout(new BoxLayout(contentPane3, BoxLayout.PAGE_AXIS));
        contentPane3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane3.add(new JLabel("Board"));
        
        // Layout for Player 2
        contentPane2.setLayout(new GridLayout(15, 2, 5, 5)); 
        count = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 1) {
                contentPane2.add(new JLabel(categories[count]));
                count++;
            } else {
                contentPane2.add(new JLabel("00"));
            }
            
        }
    
        // Frame for Player 1
        player1 = new JFrame("Player 1: ");
        player1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        // Frame for Player 2
        player2 = new JFrame("Player 2: ");
        player2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Frame for Game Board
        midField = new JFrame("   ");
        midField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Making Player 1 Visible
        player1.setContentPane(contentPane1);
        player1.pack();
        player1.setVisible(true);
        player1.getContentPane().setBackground(Color.PINK);
        
        // Adding Buttons and Dice to Game Board
        
        roll1 = new JButton("ROLL");
        roll1.setPreferredSize(new Dimension(50, 200));
        contentPane3.add(roll1);

        
        // Making Game Board Visible and Setting Position
        midField.setContentPane(contentPane3);
        midField.pack();
        midField.setLocation(player1.getX() + player1.getWidth(), player1.getY());
        midField.setVisible(true);
        
        // Making Player 2 visible and setting position
        player2.setContentPane(contentPane2);
        player2.pack();
        player2.setLocation(midField.getX() + midField.getWidth(), midField.getY());
        player2.setVisible(true);
        player2.getContentPane().setBackground(Color.PINK);

        
    }
    // Allows GUI to be run from the main method
    public static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        BoardDesign board = new BoardDesign();
    }
}


