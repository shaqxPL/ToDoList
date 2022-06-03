import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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
        this.taskList.add(new Task(title,project,dueDate));
    }
    /**
     * A method to read the value from user (standard input, i.e., terminal)
     * to create a Task object and to add in the ArrayList of Tasks
     * @return true, if the Tasks object is created and added to ArrayList, otherwise false
     */
    public boolean readTaskFromUser(){
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter the following details to add a task: ");
            System.out.println(">>> Task Title   :  ");
            String title = scan.nextLine();

            System.out.println(">>> Project Name :  ");
            String project = scan.nextLine();

            System.out.println(">>> Due Date [example: 2022-06-25] :  ");
            LocalDate dueDate = LocalDate.parse(scan.nextLine());

            this.taskList.add(new Task(title,project,dueDate));

            //TODO: Dodać wywołanie metody showmessage() o dodaniu taska
            System.out.println("DODANO TASK!");
            return true;
        }
        catch (Exception e) {
            //TODO Dodać wywołanie metody showmessage() o niedodaniu taska
            return false;
        }
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