package Model.AbstractClass;

public abstract class Task {
    String name;
    boolean IsDone = false;

    public Task(String name)
    {
        this.name = name;
    }

    public boolean GetDone()
    {
        return this.IsDone;
    }

    public void IsDone()
    {
        this.IsDone = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
