package home4.update;


import home4.update.File.Writer;
import home4.update.Model.Task;
import home4.update.Model.TaskList;
import home4.update.View.ConsoleView;

import java.io.FileWriter;
import java.io.IOException;

public class TaskFactory {
    ConsoleView view;
    private static int id;

    static {
        TaskFactory.id = 0;
    }



    /**
     * Добавляет задачу
     */
    public TaskList addTask(TaskList taskList){
        //System.out.println(taskList);
        view = new ConsoleView();
        String name = view.getString("Enter a name: ");
        String priority = view.getChoicePriority();
        //String date1 = view.getString(""); // ??????????????
        String date = view.getString("Enter date: ");
        String owner = view.getString("Enter owner: ");
        String deadline = view.getString("Enter deadline: ");
        id ++;
        Task nameTask = new Task(name, id, priority, date, owner, deadline);
        //writer.writeTask(nameTask);
        taskList.add(nameTask);
        //System.out.println(taskList);
        return  taskList;
    }


}
