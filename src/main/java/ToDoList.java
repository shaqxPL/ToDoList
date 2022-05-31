import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Task> taskList;

    /**
     * creating an TodoList object
     */
    public ToDoList() {
        taskList = new ArrayList<>();
    }

/**
 * Adding a Task object in ArrayList
 * @param title A String that holds the title of a task and it cannot be empty or null.
 * @param project A String that holds the name of project associated with task, and it could be an empty string.
 * @param dueDate The due date of the task as yyyy-mm-dd format
 */
    public void addTask(String title, String project, LocalDate dueDate) {

    }
    /**
     * A method to read the value from user (standard input, i.e., terminal)
     * to create a Task object and to add in the ArrayList of Tasks
     * @return true, if the Tasks object is created and added to ArrayList, otherwise false
     */
    public boolean readTaskFromUser(){
        return false;
    }

    /**
     * A method to read the value from user (standard input, i.e., terminal)
     * and update the given Task object in the ArrayList of Tasks
     * @param task the task object whose value need to be updated with user input
     * @return true, if the Tasks object is updated in ArrayList, otherwise false
     */
    public boolean readTaskFromUserToUpdate(Task task){
        return false;
    }

    /**
     * A method to display the contents of ArrayList with first column as task number
     */
    public void listAllTasksWithIndex(){

    }

    /**
     * A method to display the contents of ArrayList
     * @param sortBy a string holding a number, "2" for sorting by project, otherwise it will sorty by date
     */
    public void listAllTasks(String sortBy) {

    }





}




