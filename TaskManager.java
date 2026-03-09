import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTasks() {
        for (Task t : tasks) {
            t.displayTask();
        }
    }
}