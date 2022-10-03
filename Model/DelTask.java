package home4.update.Model;

import home4.update.View.ConsoleView;
import home4.update.View.PrintView;

public class DelTask {
    PrintView printView;
    ConsoleView view;

    public DelTask(){
        this.printView = new PrintView();
        this.view = new ConsoleView();
    }

    public TaskList deleteTask(TaskList taskList){
        if(taskList.tasks.isEmpty()){
            System.out.println("Tasklist is empty");
        }
        else{
            printView.viewTasklist(taskList);
            int choice = view.getValueChoice("Enter number of task to delete: ", taskList.size());
            taskList.tasks.remove(choice - 1);
        }
        return taskList;
    }
}
