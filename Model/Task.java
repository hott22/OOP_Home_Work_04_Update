package home4.update.Model;

public class Task {
    private String name;
    private String priority;
    private int id;
    private String date;
    private String owner;
    private String deadline;
    private boolean status;


    public Task(String name, int id, String priority, String date, String owner, String deadline){
        this.name = name;
        this.id = id;
        this.priority = priority;
        this.date = date;
        this.owner = owner;
        this.deadline = deadline;
        this.status = true;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(boolean status) {this.status = status; }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus(){
        return status;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return String.format("name : %s, id : %d, priority : %s, date : %s, owner : %s, " +
                "deadline : %s, status : %b", name, id, priority, date, owner, deadline, status);
    }

}
