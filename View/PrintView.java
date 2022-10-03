package home4.update.View;
import home4.update.Model.TaskList;

public class PrintView {

    public void viewTasklist(TaskList taskList){
        System.out.println("Task list: ");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.print(taskList.get(i).getName() + " : " + (i+1));
            System.out.println();
        }
    }

    public void viewTaskByNumber(TaskList taskList){
        ConsoleView view = new ConsoleView();
        viewTasklist(taskList);
        int choice  = view.getValueChoice("Enter task number: ", taskList.size());
        System.out.println(taskList.get(choice - 1));
    }

}
