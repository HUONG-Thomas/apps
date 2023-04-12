package View;

import Controller.MainMenu.MainMenuObserver;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

    public MainMenu()
    {
        // Create the label and set its properties
        JLabel label = new JLabel("Welcome to My Swing Page");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Create the button and set its properties and the observer
        JButton button = new JButton("Start Project");
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.addActionListener(new MainMenuObserver());

        // Create a panel to hold the label and button
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 0, 10, 0);
        // Add the label to the panel
        panel.add(label, gbc);

        // Add some vertical space between the label and button
        gbc.insets = new Insets(0, 0, 20, 0);
        panel.add(Box.createVerticalStrut(40), gbc);

        // Add the button to the panel
        gbc.insets = new Insets(0, 0, 10, 0);
        panel.add(button, gbc);

        // Add the panel to the main panel
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
    }
}
