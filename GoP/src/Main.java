import View.MainView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        /// TESTS OK
        /*
        // GameModel is the game's model
        // GameController is the class making the app work
        GameController game = new GameController();
        game.GameStart();

        game.CreateSprint("test1");

        // let's add some user stories
        for(int i = 0; i < 10; i++)
        {
            game.AddUserStories("user story " + i);
        }

        // add 2 logs to the user back log
        game.AddLogToBackLog("Day 1 : init project");
        game.AddLogToBackLog("Day 2 : nice, is going smooth");

        // Let's get the list of all the user stories of the current sprint
        ArrayList<UserStory> userStories = game.GetUserStories();
        UserStory lastOne = userStories.get(userStories.size() - 1);

        // Now let's mark that user story as done
        game.MarkUserStoryAsDone(lastOne);

        // Finally we mark the sprint itself as done
        game.MarkSprintAsDone();

        // And now we print everything !
        for(Sprint s : game.GetSprints())
        {
            System.out.println(s.getName());
            for(UserStory u : s.getUserStories())
            {
                System.out.println(u.getName());
                System.out.println(u.GetDone());
            }
        }
        */

        MainView mainView = MainView.getInstance();
    }
}