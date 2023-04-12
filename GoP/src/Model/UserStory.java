package Model;

import Model.AbstractClass.Task;

import java.util.*;

public class UserStory extends Task {
    String name;
    ArrayList<User> userList;

    public UserStory(String name)
    {
        super(name);
    }

    public ArrayList<User> GetUserList()
    {
        return this.userList;
    }

    public void AddUser(User user)
    {
        if(this.userList == null)
        {
            this.userList = new ArrayList<>();
        }

        this.userList.add(user);
    }

    public void RemoveUser(User user)
    {
        this.userList.remove(user);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}
