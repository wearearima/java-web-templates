package eu.arima;

import java.util.Date;

import eu.arima.tasks.Priority;
import eu.arima.tasks.Task;

/**
 * A presentation object to encapsulate a {@link Task} and add function to evaluate if
 * the task is High priority or not.
 */
public class MustacheTask {

	private final long id;
	
	private final String name;
	
	private final Date creationDate;
	
	private final Date finishDate;
	
	private final Priority priority;

	public MustacheTask(Task task) {
		this.id = task.getId();
		this.name = task.getName();
		this.creationDate = task.getCreationDate();
		this.finishDate = task.getFinishDate();
		this.priority = task.getPriority();
	}
	
	public long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public Date getFinishDate() {
		return this.finishDate;
	}

	public Priority getPriority() {
		return this.priority;
	}

	public boolean getHighPriority() {
		return Priority.HIGH.equals(this.priority);
	}
	
}
