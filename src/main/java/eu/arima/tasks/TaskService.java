package eu.arima.tasks;

import java.util.List;

import org.springframework.data.domain.Pageable;

public interface TaskService {

	List<Task> find(Pageable pageable);
	
}
