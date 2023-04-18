package Model;

import Model.AbstractClass.Task;

import java.util.ArrayList;

public class Sprint extends Task{
    ArrayList<String> Backlog;
    ArrayList<UserStory> UserStories;
    boolean IsDone = false;

    public Sprint(String name)
    {
        // sprint starts when created
        super(name);
        Backlog = new ArrayList<>();
        UserStories = new ArrayList<>();
    }

    public void AddUserStory(UserStory userStory)
    {
        this.UserStories.add(userStory);
    }

    public void AddLogToBacklog(String log)
    {
        this.Backlog.add(log);
    }

    public ArrayList<String> getBacklog() {
        return Backlog;
    }

    public void setBacklog(ArrayList<String> backlog) {
        Backlog = backlog;
    }

    public ArrayList<UserStory> getUserStories() {
        return UserStories;
    }

    public void setUserStories(ArrayList<UserStory> userStories) {
        UserStories = userStories;
    }
}
