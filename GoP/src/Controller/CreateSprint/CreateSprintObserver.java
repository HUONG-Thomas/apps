package Controller.CreateSprint;

import View.CreateSprint;
import View.MainView;

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
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
