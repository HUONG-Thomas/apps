package Model;

import java.util.ArrayList;

public class GameModel {
    ArrayList<User> users;
    ArrayList<Sprint> sprints;

    public GameModel() {
        users = new ArrayList<>();
        sprints = new ArrayList<>();
    }

    public Sprint addSprint(String name)
    {
        Sprint sprint = new Sprint(name);
        sprints.add(sprint);
        return sprint;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(ArrayList<Sprint> sprints) {
        this.sprints = sprints;
    }
}
