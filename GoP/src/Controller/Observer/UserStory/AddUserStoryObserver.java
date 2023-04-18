package Controller.Observer.UserStory;

import Controller.GameController;
import Model.Enumeration.Role;
import Model.Enumeration.Sex;
import Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class AddUserStoryObserver implements Observer, ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<User> userList = new ArrayList<>();
        String name = JOptionPane.showInputDialog("Input userstory's name :");
        String userName = "default";

        while(!userName.equals("") && !name.equals(""))
        {
            if(!userName.equals("default"))
            {
                userList.add(new User(userName, Sex.Male, Role.Developer));
            }
            userName = JOptionPane.showInputDialog("Input a user for the userstory :");
        }

        if (!name.equals("")) {
            // do something with the input
            GameController.GetInstance().AddUserStory(name, userList);
        }
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
