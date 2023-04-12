package Model;

import Model.Enumeration.Role;
import Model.Enumeration.Sex;

public class User {

    private String name;

    private Sex sex;

    private Role role;

    public User(String name, Sex sex, Role role)
    {
        this.name = name;
        this.sex = sex;
        this.role = role;
    }

    // TODO get pending tasks and done tasks

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
