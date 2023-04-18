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

    public UserStoryComponent(UserStory userStory, ArrayList<User> userList) {
        // Create the label
        this.userStory = userStory;
        users = new ArrayList<>();

        label = new JLabel(userStory.toString());
        add(label);

        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane);

        list = new JList<>();
        list.setCellRenderer(new UserStoryListRenderer());
        scrollPane.setViewportView(list);

        for (User user : userList) {
            addUser(user);
        }
    }

    public void addUser(User user) {
        users.add(user);
        User[] userArray = users.toArray(new User[users.size()]);
        list.setListData(userArray);
    }

    // Get the selected value from the list
    public User getSelectedUser() {
        return list.getSelectedValue();
    }
}
