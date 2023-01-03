


public class Task {
    
    private final int iD_Task;
    private int estimatedTime;
    private String description;
    private String taskSubject;
    private int creator;
    private final DB_abfrage db_abfrage = new DB_abfrage();
    
    public Task(int iD_Task){
        this.iD_Task = iD_Task;
        this.estimatedTime = db_abfrage.getEstimatedTime(this.iD_Task);
        this.description = db_abfrage.getDescription(this.iD_Task);
        this.taskSubject = db_abfrage.getTaskSubject(this.iD_Task);
        this.creator = db_abfrage.getCreator(this.iD_Task);
    }

    public Task(int estimatedTime, String description, String taskSubject, int creator) {
        this.iD_Task = db_abfrage.createTask(1, estimatedTime, description, taskSubject, creator);
        this.estimatedTime = estimatedTime;
        this.description = description;
        this.taskSubject = taskSubject;
    }

    public int getiD_Task() {
        return iD_Task;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public int getStatus(int id_Worker) {
        int status = db_abfrage.getStatus(this.iD_Task, id_Worker);
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getTaskSubject() {
        return taskSubject;
    }
    
    public int getUsedTime(int id_Worker){
        int usedTime = db_abfrage.getUsedTime(this.iD_Task, id_Worker);
        return usedTime;
    }

    public int getCreator() {
        return creator;
    }
    
    
    //Setter


    public void setEstimatedTime(int estimatedTime){
        db_abfrage.setEstimatedTime(estimatedTime, this.iD_Task);
        this.estimatedTime = estimatedTime;
    }

    public void setStatus(int status, int iD_Worker){
        db_abfrage.setStatus(status, iD_Task, iD_Worker);
    }

    public void setDescription(String description){
        db_abfrage.setDescription(description, this.iD_Task);
        this.description = description;
    }

    public void setTaskSubject(String taskSubject){
        db_abfrage.setTaskSubject(taskSubject, this.iD_Task);
        this.taskSubject = taskSubject;
    }
    
    public void setUsedTime(int usedTime, int iD_Worker){
        db_abfrage.setUsedTime(usedTime, this.iD_Task, iD_Worker);
    }
    
    public void setCreator(int creator){
        db_abfrage.setCreator(creator, this.iD_Task);
        this.creator = creator;
    }
    
    public void fillworkertasktable(int iD_Worker){
        db_abfrage.setTask(iD_Worker, this.iD_Task);
    }
    
}


