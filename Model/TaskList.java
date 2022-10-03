package home4.update.Model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<Task> tasks;
    public TaskList(){
        tasks = new ArrayList<>();

    }


    public void add(Task o) {
        tasks.add(o);
    }

    @Override
    public String toString() {
        String a = "";
        if(tasks.isEmpty()){
            a = "Tasklist is empty";
        }
        else{
            for (Task task :
                    tasks) {
                a = a + "\n" + task.toString() + "\n";
            }
        }
        return a;
    }

    public int size() {
       return tasks.size();
    }


    public Task get(int index){
        return tasks.get(index);
    }

}
