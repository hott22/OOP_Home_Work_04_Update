package home4.update;

import home4.update.File.Reader;
import home4.update.File.Writer;
import home4.update.Model.TaskList;
import home4.update.View.ConsoleView;

import java.io.IOException;

public class Presenter {


    public static void start() throws IOException {
        TaskFactory taskFactory = new TaskFactory();
        ConsoleView view = new ConsoleView();
        Reader reader = new Reader();
        Writer writer = new Writer();
        TaskList taskList;
        TaskList taskList1;

        taskList = reader.readFile();
        System.out.println(taskList);
        taskList1 = taskFactory.addTask(view,taskList);
        //taskFactory.addTask(view,taskList);
        writer.writeAllTask(taskList1);
    }
}
