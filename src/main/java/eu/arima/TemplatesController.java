package eu.arima;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.arima.tasks.Task;
import eu.arima.tasks.TaskService;

@RequestMapping("/templates")
@Controller
public class TemplatesController {
	
	private final TaskService taskService;
	
	public TemplatesController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping("/jsp")
	public String jsp(Model model, Pageable pageable) {
		model.addAttribute(taskService.find(pageable));
		
		return "jsp/taskList";
	}
	
	@GetMapping("/thymeleaf")
	public String thymeleaf(Model model, Pageable pageable) {
		model.addAttribute(taskService.find(pageable));
		
		return "thymeleaf/taskList";
	}
	
	@GetMapping("/mustache")
	public String mustache(Model model, Pageable pageable) {
		List<Task> tasks = taskService.find(pageable);
		
		List<MustacheTask> mustacheTasks = new ArrayList<>();
		for (Task task : tasks) {
			mustacheTasks.add(new MustacheTask(task));
		}
			
		model.addAttribute("taskList", mustacheTasks);
		
		return "mustache/taskList";
	}
	
}
