import java.time.LocalDate;

public class Task {

    private String title;
    private String project;
    private Boolean complete;
    private LocalDate dueDate;

    public Task(String title, String project, Boolean complete, LocalDate dueDate) {
        this.title = title;
        this.project = project;
        this.complete = false;
        this.dueDate = dueDate;

    }
    //nie wiem: Task(): Task

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Boolean isComplete() {
        return false;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // public String formattedStringOfTask() {
    //    return null;
   // }
}


