import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {

    private String title;
    private String project;
    private boolean complete;
    private LocalDate dueDate;

    public Task(String title, String project, LocalDate dueDate) {
        this.title = title;
        this.project = project;
        this.complete = false;
        this.dueDate = dueDate;

    }

    /**
     * A method to get the task title
     * @return a String containing the title of a task
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * A method to set the title of a Task object
     * @param title A String that holds the title of a task. It cannot be empty or null.
     * @throws NullPointerException if title is null or empty string
     */
    public void setTitle(String title)throws NullPointerException {
        if (title.trim().equals("") || title == null){
            throw new NullPointerException("Required: title can not be empty");
        }
        this.title = title.trim();
    }

    /**
     * A method to get the project name
     * @return a String containing the project name
     */
    public String getProject() {
        return this.project;
    }

    /**
     * A method to set the project name
     * @param project A String that holds the name of project associated with task, and it could be an empty string.
     */
    public void setProject(String project) {
        this.project = project;
    }

    /**
     * A method to get the completed status of task
     * @return true: if the task is marked as completed, otherwise it will return false
     */
    public boolean isComplete() {
        return false;
    }

    /**
     * A method to get the due date of the task
     * @return the due date of task as LocalDate object
     */
    public LocalDate getDueDate() {
        return this.dueDate;
    }

    /**
     * A method to set the due date of a task
     * @param dueDate The due date of the task as yyyy-mm-dd format
     * @throws DateTimeException if given date is a past date
     */
    public void setDueDate(LocalDate dueDate)throws DateTimeException {
        if (dueDate.compareTo(LocalDate.now())<0){
            throw new DateTimeException("This is past date");
        }
        //upewnienie się że yyyy-MM-dd to jest rok, miesiąc i dzień
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.dueDate = LocalDate.parse(dueDate.format(formattedDate));
    }

    /**
     * A method to get the task data as formatted string to display in multiple lines
     * @return formatted string of all fields of a task
     */
     public String formattedStringOfTask() {
        return null;
    }
}


