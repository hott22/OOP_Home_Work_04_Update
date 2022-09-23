package home4.update.Model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> tasks;
    public TaskList(){
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void add(Task o) {
        tasks.add(o);
    }

    @Override
    public String toString() {
        String a = "";
        for (Task task :
                tasks) {
            a = a + "\n" + task.toString() + "\n";
        }
        return a;
    }
}
