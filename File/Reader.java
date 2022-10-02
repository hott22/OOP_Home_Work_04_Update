package home4.update.File;

import home4.update.Model.Task;
import home4.update.Model.TaskList;

import java.io.*;

import static home4.update.File.Config.*;

public class Reader {
    public TaskList readFile() {
        TaskList taskList = new TaskList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                taskList.add(taskFromLine(line));

                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return taskList;
    }




        public Task taskFromLine (String line){
            String[] splitedLine = line.split(", |: ");

            Task task = new Task(splitedLine[1], Integer.parseInt(splitedLine[3]), splitedLine[5], splitedLine[7], splitedLine[9],
                    splitedLine[11]);
            task.setStatus(Boolean.parseBoolean(splitedLine[13]));
            return task;
        }


    }

