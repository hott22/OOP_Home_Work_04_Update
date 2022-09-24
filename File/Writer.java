package home4.update.File;

import home4.update.Model.Task;
import home4.update.Model.TaskList;

import java.io.FileWriter;
import java.io.IOException;
import static home4.update.File.Config.*;

public class Writer {

    FileWriter writ;

    public Writer() throws IOException {
        writ = new FileWriter(path, false);
    }

    public void writeAllTask(TaskList taskList) throws IOException {
        for (int i = 0; i < taskList.size(); i++) {
            writ.write(taskList.get(i).toString() + "\n");
        }
        writ.close();
    }
}
