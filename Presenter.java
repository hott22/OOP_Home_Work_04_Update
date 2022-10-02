package home4.update;

import home4.update.File.Reader;
import home4.update.File.Writer;
import home4.update.Model.TaskList;
import home4.update.View.ConsoleView;

import java.io.IOException;
import java.util.List;

public class Presenter {


    public static void start() throws IOException {
        TaskFactory taskFactory = new TaskFactory();
        ConsoleView view = new ConsoleView();
        Reader reader = new Reader();
        TaskList taskList;
        taskList = reader.readFile();

        //System.out.println(taskList);
        while (true){
            int choice = view.getValueChoice("""
                    -----------
                    1 - Viewing tasks
                    2 - Add task
                    3 - Delete task
                    4 - Update task
                    5 - Save tasks in file
                    6 - Exit
                    -----------
                    Choice:\s""",6);
            if(choice == 1){
                System.out.println(taskList);
            }
            if(choice == 2){
                taskList = taskFactory.addTask(taskList);

            }
            if(choice == 5){
                Writer writer = new Writer();
                //System.out.println(taskList);
                writer.writeAllTask(taskList);
            }
            if(choice == 6){
                break;
            }

        }

    }
}
