package com.in28minutes.springboot.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class TodoController {
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	private TodoService todoservice;
	
	@RequestMapping("List-todos")
	
	public String listAllTodos(ModelMap model) {
		List<Todo> todos=todoservice.findByusername("in28minutes");
		model.addAttribute("todos",todos);
		return "listTodos";
	}
	@RequestMapping(value="add-todo", method =RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}
	
	@RequestMapping(value="add-todo", method =RequestMethod.POST)
	public String addNewTodo(@RequestParam String description , ModelMap model ) {
		String username=(String) model.get("name");
		todoservice.addTodo(username,description,LocalDate.now().plusYears(1),false);
		return "redirect:List-todos";
	}

}
