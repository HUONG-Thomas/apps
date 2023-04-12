package View.Component;

import Controller.Helper.UserStoryListRenderer;
import Model.User;
import Model.UserStory;

import javax.swing.*;
import java.util.ArrayList;

public class UserStoryComponent extends JPanel {
    private UserStory userStory;
    private ArrayList<User> users;
    private JLabel label;
    private JList<User> list;

    public UserStoryComponent(String name) {
        // Create the label
        userStory = new UserStory(name);
        users = new ArrayList<>();

        label = new JLabel(userStory.toString());
        this.add(label);
    }

    public void addUser(User user)
    {
        users.add(user);
        User[] userArray = users.toArray(new User[users.size()]);
        list = new JList<>(userArray);
        list.setCellRenderer(new UserStoryListRenderer());

        this.removeAll();
        this.add(label);
        this.add(list);
        this.revalidate();
        this.repaint();
    }

    // Get the selected value from the list
    public User getSelectedUser() {
        return list.getSelectedValue();
    }
}

