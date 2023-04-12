package View;

import Model.Enumeration.Role;
import Model.Enumeration.Sex;
import Model.User;
import View.Component.UserStoryComponent;

import javax.swing.*;

public class UserStoryView extends JPanel {

    public UserStoryView()
    {
        UserStoryComponent tester = new UserStoryComponent("test1");
        tester.addUser(new User("Nicolas", Sex.Female, Role.ProductOwner));
        tester.addUser(new User("Thomas", Sex.Male, Role.ScrumMaster));
        tester.addUser(new User("Marcelin", Sex.Male, Role.Developer));

        this.add(tester);
        tester.setVisible(true);

        JButton addUserStory = new JButton();
    }
}
