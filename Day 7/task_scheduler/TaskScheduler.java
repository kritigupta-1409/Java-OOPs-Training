package task_scheduler;

import java.util.Scanner;

public class TaskScheduler {

	public static void main(String[] args) {
		TaskService service = new TaskService();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n-- TASK SCHEDULER MENU --\n");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Next Task");
            System.out.println("4. Show All Tasks");
            System.out.println("5. Exit");
            System.out.println("\n-------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter Task ID: ");
                int taskId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Task Name: ");
                String taskName = sc.nextLine();
                System.out.print("Enter Priority: ");
                String priority = sc.nextLine();
                
                Task newTask = new Task(taskId, taskName, priority);
                service.addTask(newTask);

                System.out.println("Task Added Successfully");
                break;

            case 2:
                service.removeTask();
                System.out.println("Task Removed Successfully");
                break;

            case 3:
                Task next = service.getNextTask();
                if (next == null) {
                    System.out.println("No tasks available");
                } else {
                    System.out.println("Next Task: " + next);
                }
                break;
            case 4:
                service.showAllTasks();
                break;
            case 5:
                System.out.println("Thank you for using Task Scheduler :)");
                break;
            default:
                System.out.println("Invalid Choice");
            }
        } while (choice != 5);
        sc.close();
	}
}
