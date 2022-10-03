package home4.update.Model;

import home4.update.View.ConsoleView;
import home4.update.View.PrintView;

public class UpdateTask {

    ConsoleView view;
    PrintView printView;

    public UpdateTask(){
        view = new ConsoleView();
        printView = new PrintView();
    }


    public TaskList updTaskStatus(TaskList taskList){

        if(taskList.tasks.isEmpty()){
            System.out.println("Tasklist is empty");
        }
        else {
            printView.viewTasklist(taskList);
            int choice = view.getValueChoice("Enter number of task to update status: ", taskList.size());
            taskList.tasks.get(choice - 1).setStatus(!taskList.tasks.get(choice - 1).getStatus());
        }
        return taskList;
    }


    public TaskList updTaskPriority(TaskList taskList){
        String priority = "";
        if(taskList.tasks.isEmpty()){
            System.out.println("Tasklist is empty");
        }
        else {
            printView.viewTasklist(taskList);
            int choice = view.getValueChoice("Enter number of task to update priority: ", taskList.size());
            int choice1 = view.getValueChoice("""
                    1 - low
                    2 - medium
                    3 - high
                    Choice:\s""",3);
            switch (choice1) {
                case 1 -> priority = "low";
                case 2 -> priority = "medium";
                case 3 -> priority = "high";
            }
            taskList.tasks.get(choice - 1).setPriority(priority);

        }
        return taskList;
    }
}
