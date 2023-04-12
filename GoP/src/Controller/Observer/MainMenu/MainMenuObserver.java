package Controller.Observer.MainMenu;

import View.CreateSprintView;
import View.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MainMenuObserver implements Observer, ActionListener {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("view has changed");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MainView.getInstance().ChangeView(new CreateSprintView());
    }
}
