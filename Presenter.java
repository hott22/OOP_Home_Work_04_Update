package home4.update;

import home4.update.File.Reader;
import home4.update.File.Writer;
import home4.update.Model.DelTask;
import home4.update.Model.TaskFactory;
import home4.update.Model.TaskList;
import home4.update.Model.UpdateTask;
import home4.update.View.ConsoleView;

import java.io.IOException;

public class Presenter {


    public static void start() throws IOException {
        TaskFactory taskFactory = new TaskFactory();
        ConsoleView view = new ConsoleView();
        Reader reader = new Reader();
        TaskList taskList;
        taskList = reader.readFile();

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
            if(choice == 3){
                DelTask delTask = new DelTask();
                taskList = delTask.deleteTask(taskList);
            }
            if(choice == 4){
                UpdateTask updateTask = new UpdateTask();
                int choice1 = view.getValueChoice("1 - Update status\n2 - Update priority\nChoise: ",2);
                if(choice1 == 1){
                    taskList = updateTask.updTaskStatus(taskList);
                }
                else {
                    taskList = updateTask.updTaskPriority(taskList);
                }
            }

            if(choice == 5){
                Writer writer = new Writer();
                writer.writeAllTask(taskList);
            }
            if(choice == 6){
                break;
            }

        }

    }
}
