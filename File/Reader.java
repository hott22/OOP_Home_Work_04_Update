package home4.update.File;

import home4.update.Model.Task;
import home4.update.Model.TaskList;

import java.io.*;

import static home4.update.File.Config.*;

public class Reader {

    //FileReader reader;
    //BufferedReader bufferedReader;

/*    public Reader() throws FileNotFoundException {
        //reader = new FileReader(path);
        //bufferedReader = new BufferedReader(reader);
    }*/

/*
    public TaskList readFile() throws IOException {
        TaskList taskList = new TaskList();
        String line = bufferedReader.readLine();
        while (line != null) {
            taskList.add(taskFromLine(line));
            line = bufferedReader.readLine();
        }
        return taskList;
    }
*/
    public TaskList readFile() {
        TaskList taskList = new TaskList();
        try {
            //taskList = new TaskList();
            File file = new File(path);
            FileReader fe = new FileReader(file);
            BufferedReader reader = new BufferedReader(fe);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
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

