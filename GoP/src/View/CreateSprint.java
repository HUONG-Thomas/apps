package View;

import javax.swing.*;
import java.awt.*;

public class CreateSprint extends JPanel {
    public CreateSprint()
    {
        setSize(1200, 800);

        // Create the label and set its properties
        JLabel label = new JLabel("Let's make your first sprint");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Create the text field
        JTextField textfield = new JTextField(20);

        // Create the button and set its properties and the observer
        JButton button = new JButton("Create sprint");
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        // MainMenuObserver observer = new MainMenuObserver();
        // button.addActionListener(observer);

        // Create a panel to hold the label and button
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 0, 10, 0);
        // Add the label to the panel
        panel.add(label, gbc);

        // Add some vertical space between the label and the input
        gbc.insets = new Insets(0, 0, 20, 0);
        panel.add(Box.createVerticalStrut(40), gbc);

        // Add the input
        gbc.insets = new Insets(0, 0, 10, 0);
        panel.add(textfield, gbc);

        // Add some vertical space between the input and button
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
