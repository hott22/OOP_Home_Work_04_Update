package home4.update;

import home4.update.File.Writer;
import home4.update.Model.TaskList;
import home4.update.View.ConsoleView;

import java.io.IOException;

public class Presenter {


    public static void start() throws IOException {
        TaskFactory taskFactory = new TaskFactory();
        ConsoleView view = new ConsoleView();
        //Writer writer = new Writer();
        TaskList taskList = new TaskList();
        taskFactory.addTask(view,taskList);
        taskFactory.addTask(view, taskList);
    }
}
