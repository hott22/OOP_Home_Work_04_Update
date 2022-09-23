package home4.update.File;

import home4.update.Model.Task;

import java.io.FileWriter;
import java.io.IOException;
import static home4.update.File.Config.*;

public class Writer {

    FileWriter writ;

    public Writer() throws IOException {
        writ = new FileWriter(path, true);
    }

    public void writeTask(Task task) throws IOException {
        writ.write(task.toString() + "\n");
        writ.flush();
    }
}
