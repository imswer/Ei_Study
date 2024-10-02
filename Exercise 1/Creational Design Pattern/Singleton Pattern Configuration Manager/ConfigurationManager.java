
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nEnter a command (add, remove, view, exit):");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter description:");
                    String desc = scanner.nextLine();
                    System.out.println("Enter start time (HH:MM):");
                    String startTime = scanner.nextLine();
                    System.out.println("Enter end time (HH:MM):");
                    String endTime = scanner.nextLine();
                    System.out.println("Enter priority (High/Medium/Low):");
                    String priority = scanner.nextLine();
                    Task task = TaskFactory.createTask(desc, startTime, endTime, priority);
                    manager.addTask(task);
                    break;
                case "remove":
                    System.out.println("Enter the description of the task to remove:");
                    String removeDesc = scanner.nextLine();
                    manager.removeTask(removeDesc);
                    break;
                case "view":
                    System.out.println("Current tasks:");
                    manager.viewTasks();
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
