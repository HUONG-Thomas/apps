package View;

import Controller.Observer.UserStory.AddUserStoryObserver;
import Model.Enumeration.Role;
import Model.Enumeration.Sex;
import Model.User;
import Model.UserStory;
import View.Component.UserStoryComponent;

import javax.swing.*;
import java.awt.*;

public class UserStoryView extends JPanel {

    private JPanel userStoryListPanel;

    public UserStoryView(String name) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel sprintName = new JLabel(name);
        sprintName.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(sprintName);

        JButton addUserStory = new JButton("Add a user story");
        addUserStory.setAlignmentX(Component.CENTER_ALIGNMENT);
        addUserStory.addActionListener(new AddUserStoryObserver());
        add(addUserStory);

        userStoryListPanel = new JPanel();
        userStoryListPanel.setLayout(new BoxLayout(userStoryListPanel, BoxLayout.Y_AXIS));
        add(userStoryListPanel);
    }

    public void addUserStoryComponent(UserStoryComponent userStoryComponent) {
        userStoryListPanel.add(userStoryComponent);
        revalidate();
        repaint();
    }
}
