package eu.arima.tasks;

import java.util.Date;

public class Task {

	private final long id;
	
	private final String name;
	
	private final Date creationDate;
	
	private final Date finishDate;
	
	private final Priority priority;

	public Task(long id, String name, Date creationDate, Date finishDate, Priority priority) {
		this.id = id;
		this.name = name;
		this.creationDate = creationDate;
		this.finishDate = finishDate;
		this.priority = priority;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public Priority getPriority() {
		return priority;
	}
	
}
