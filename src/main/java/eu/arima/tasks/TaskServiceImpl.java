package eu.arima.tasks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class TaskServiceImpl implements TaskService {

	@Override
	public List<Task> find(Pageable pageable) {
		List<Task> tasks = new ArrayList<>();
		
		for (int i=0; i<pageable.getPageSize(); i++) {
			Priority priority = Priority.LOW;
			if (i%2==0) {
				priority = Priority.HIGH;
			}
			
			tasks.add(new Task((long) i, "name" + i, new Date(), new Date(), priority));
		}
		return tasks;
	}

}
