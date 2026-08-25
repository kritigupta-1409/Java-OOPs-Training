package task_scheduler;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskService {
	 Deque<Task> allTasks = new ArrayDeque<>();

	    void addTask(Task newTask) {
	        allTasks.offer(newTask);
	    }

	    void showAllTasks() {
	        for (Task task : allTasks)
	            System.out.println(task);
	    }

	    void removeTask() {
	        allTasks.poll();
	    }

	    Task getNextTask() {
	        return allTasks.peek();
}
}