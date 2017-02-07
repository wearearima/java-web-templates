package eu.arima;

import java.util.Date;

import eu.arima.tasks.Priority;
import eu.arima.tasks.Task;

/**
 * A presentation object to encapsulate a {@link Task} and add function to evaluate if
 * the task is High priority or not.
 */
public class MustacheTask {

	private final Task task;
	
	private final boolean highPriority;

	public MustacheTask(Task task) {
		this.task = task;
		this.highPriority = Priority.HIGH.equals(task.getPriority());
	}
	
	public long getId() {
		return this.task.getId();
	}

	public String getName() {
		return this.task.getName();
	}

	public Date getCreationDate() {
		return this.task.getCreationDate();
	}

	public Date getFinishDate() {
		return this.task.getFinishDate();
	}

	public Priority getPriority() {
		return this.task.getPriority();
	}

	public boolean getHighPriority() {
		return this.highPriority;
	}
	
}
