package home4.update.Model;
import home4.update.View.ConsoleView;

public class TaskFactory {
    ConsoleView view;


    /**
     * Добавляет задачу
     */
    public TaskList addTask(TaskList taskList){
        view = new ConsoleView();
        String name = view.getString("Enter a name: ");
        String priority = view.getChoicePriority();
        String date2 = view.getString("");
        String date = view.getString("Enter date: ");
        String owner = view.getString("Enter owner: ");
        String deadline = view.getString("Enter deadline: ");
        int id = getIDList(taskList);
        Task nameTask = new Task(name, id, priority, date, owner, deadline);
        taskList.add(nameTask);
        return  taskList;
    }


    public int getIDList(TaskList taskList){
        if(taskList.tasks.isEmpty()){
            return 0;
        }
        else{
            Task lastTask = taskList.get(taskList.size() - 1);
            return lastTask.getId() + 1;
        }
    }

}
