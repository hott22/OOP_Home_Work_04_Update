package home4.update.File;

import home4.update.Model.TaskList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import static home4.update.File.Config.*;

public class Reader {

    FileReader reader;

    public Reader() throws FileNotFoundException {
        reader = new FileReader(path);
    }

    public TaskList readFile(String pathFile){




        return null;
    }

}
