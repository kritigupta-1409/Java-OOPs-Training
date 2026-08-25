package task_scheduler;

public class Task {
	 int taskId;
	    String taskName;
	    String priority;

	    public Task(int taskId, String taskName, String priority) {
	        super();
	        this.taskId = taskId;
	        this.taskName = taskName;
	        this.priority = priority;
	    }

	    public int getTaskId() {
	        return taskId;
	    }

	    public void setTaskId(int taskId) {
	        this.taskId = taskId;
	    }

	    public String getTaskName() {
	        return taskName;
	    }

	    public void setTaskName(String taskName) {
	        this.taskName = taskName;
	    }

	    public String getPriority() {
	        return priority;
	    }

	    public void setPriority(String priority) {
	        this.priority = priority;
	    }

	    @Override
	    public String toString() {
	        return "Task [taskId=" + taskId + ", taskName=" + taskName + ", priority=" + priority + "]";
}
}