package Controller;

import Model.GameModel;
import Model.Sprint;
import Model.User;
import Model.UserStory;
import View.Component.UserStoryComponent;
import View.MainView;
import View.UserStoryView;

import javax.swing.*;
import java.util.ArrayList;

public class GameController {
    private static GameController instance;
    private static GameModel gameModel;
    private static Sprint currentSprint;

    private GameController() { }

    public void GameStart()
    {
        // game starts here
        gameModel = new GameModel();
    }

    public static GameController GetInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public static void ChangeView(JPanel newView)
    {
        MainView.getInstance().ChangeView(newView);
    }

    public void CreateSprint(String name) throws Exception {
        if(currentSprint != null)
        {
            throw new Exception("Can't create new sprint during a sprint !");
        }
        else
        {
            currentSprint = gameModel.addSprint(name);
            ChangeView(new UserStoryView(name));
        }
    }

    public void AddUserStory(String name, ArrayList<User> userList)
    {
        UserStory userStory = new UserStory(name);
        currentSprint.AddUserStory(userStory);
        MainView.getInstance().AddComponent(new UserStoryComponent(userStory, userList));
    }

    public void AdUserToUserStory(User user)
    {

    }

    public static void AddLogToBackLog(String log)
    {
        currentSprint.AddLogToBacklog(log);
    }

    public static void MarkUserStoryAsDone(UserStory userStory)
    {
        userStory.IsDone();
    }

    public static void MarkSprintAsDone()
    {
        currentSprint.IsDone();
        currentSprint = null;
    }

    public static ArrayList<Sprint> GetSprints()
    {
        return gameModel.getSprints();
    }

    public static ArrayList<UserStory> GetUserStories()
    {
        return currentSprint.getUserStories();
    }
}
