package eu.arima.tasks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
class TaskServiceImpl implements TaskService {

	@Override
	public List<Task> findAll() {
		List<Task> tasks = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			tasks.add(new Task((long) i, "name" + i, new Date(), new Date(), Priority.HIGH));
		}
		return tasks;
	}

}
