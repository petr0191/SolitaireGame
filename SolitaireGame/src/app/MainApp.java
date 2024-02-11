package app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Solitaire - Software Development Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 600);
        
        JPanel tablePanel = new JPanel();
        // Optionally, set a background color to represent the table. e.g., green
        tablePanel.setBackground(new java.awt.Color(0, 128, 0));
        String imageName = "/images/10_of_clubs.png"; 
//        ImageIcon cardImage = new ImageIcon(getClass().getResource(imageName));
        Card card = new Card(CardSuit.HEARTS, CardValue.TEN);
        JLabel cardLabel = new JLabel(card.getImage());
        tablePanel.add(cardLabel);

        frame.add(cardLabel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

