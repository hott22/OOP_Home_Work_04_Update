package home4.update;


import home4.update.File.Writer;
import home4.update.Model.Task;
import home4.update.Model.TaskList;
import home4.update.View.ConsoleView;

import java.io.FileWriter;
import java.io.IOException;

public class TaskFactory {
    private static int id;
    static {
        TaskFactory.id = 0;
    }



    /**
     * Добавляет задачу
     */
    public void addTask(ConsoleView view, TaskList taskList){
        String name = view.getString("Enter a name: ");
        int numberPriority = view.getValueChoice("Enter priority:\n1 - low priority\n2 - medium priority\n3 - high priority\nChoice: ",3);
        String priority = view.getChoicePriority(numberPriority);
        String date1 = view.getString(""); // ??????????????
        String date = view.getString("Enter date: ");
        String owner = view.getString("Enter owner: ");
        String deadline = view.getString("Enter deadline: ");
        id ++;
        Task nameTask = new Task(name, id, priority, date, owner, deadline);
        //writer.writeTask(nameTask);
        taskList.add(nameTask);
        System.out.println(taskList);
    }
}
