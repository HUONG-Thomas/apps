package View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private static MainView instance = null;
    private static int Width = 1200;
    private static int Height = 800;
    JPanel display;

    private MainView() {
        this.setSize(MainView.Width, MainView.Height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Center the frame on the screen
        this.setLocationRelativeTo(null);

        MainMenu menu = new MainMenu();
        ChangeView(menu);
    }

    public static void Pop(String text, String title)
    {
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public void ChangeView(JPanel newView)
    {
        this.display = newView;
        this.getContentPane().removeAll(); // clear existing components from the content pane
        this.getContentPane().setLayout(new BorderLayout()); // set layout manager
        this.getContentPane().add(newView, BorderLayout.CENTER); // add newView to CENTER
        newView.setPreferredSize(new Dimension(MainView.Width, MainView.Height)); // set preferred size of newView
        newView.setVisible(true);
        this.pack(); // resize JFrame to fit newView
        this.revalidate();
        this.repaint(); // repaint JFrame
    }

    public static MainView getInstance() {
        if (instance == null) {
            instance = new MainView();
        }
        return instance;
    }
}
