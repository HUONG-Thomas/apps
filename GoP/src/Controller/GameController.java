package Controller;

import Model.GameModel;
import Model.Sprint;
import Model.UserStory;

import java.util.ArrayList;

public class GameController {
    GameModel gameModel;
    Sprint currentSprint;

    public GameController() { }

    public void GameStart()
    {
        // game starts here
        gameModel = new GameModel();
    }

    // TODO add user to the list of user of UserStory

    public void CreateSprint(String name) throws Exception {
        if(currentSprint != null)
        {
            throw new Exception("Can't create new sprint during a sprint !");
        }
        else
        {
            currentSprint = gameModel.addSprint(name);
        }
    }

    public void AddUserStories(String name)
    {
        currentSprint.AddUserStory(name);
    }

    public void AddLogToBackLog(String log)
    {
        currentSprint.AddLogToBacklog(log);
    }

    public void MarkUserStoryAsDone(UserStory userStory)
    {
        userStory.IsDone();
    }

    public ArrayList<UserStory> GetUserStories()
    {
        return currentSprint.getUserStories();
    }

    public void MarkSprintAsDone()
    {
        currentSprint.IsDone();
        currentSprint = null;
    }

    public ArrayList<Sprint> GetSprints()
    {
        return gameModel.getSprints();
    }
}
