package eu.arima;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import eu.arima.tasks.TaskService;

@RequestMapping("/templates")
@Controller
public class TemplatesController {
	
	private final TaskService taskService;
	
	public TemplatesController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping("/jsp")
	public String jsp(Model model) {
		model.addAttribute(taskService.findAll());
		
		return "jsp/taskList";
	}
	
	@GetMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		model.addAttribute(taskService.findAll());
		
		return "thymeleaf/taskList";
	}
	
	@GetMapping("/mustache")
	public String mustache(Model model) {
		model.addAttribute(taskService.findAll());
		
		return "mustache/taskList";
	}
	
}
