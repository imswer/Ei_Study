
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        for (Task t : tasks) {
            if (isConflict(t, task)) {
                System.out.println("Error: Task conflicts with existing task "" + t.getDescription() + "".");
                return;
            }
        }
        tasks.add(task);
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equals(description)) {
                tasks.remove(t);
                System.out.println("Task removed successfully.");
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        for (Task t : tasks) {
            System.out.println(t.toString());
        }
    }

    private boolean isConflict(Task t1, Task t2) {
        return !(t2.getEndTime().compareTo(t1.getStartTime()) <= 0 || t2.getStartTime().compareTo(t1.getEndTime()) >= 0);
    }
}
