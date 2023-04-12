package Controller.Observer.CreateSprint;

import View.MainView;
import View.UserStoryView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class CreateSprintObserver implements Observer, ActionListener {
    private JTextField textField;

    public CreateSprintObserver(JTextField textField)
    {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sprintName = textField.getText();
        MainView.Pop(sprintName, "Sprint name");

        MainView.getInstance().ChangeView(new UserStoryView());
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}