package com.in28minutes.springboot.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList<>();
	private static int todosCount=0;
	static{
		todos.add(new Todo(++todosCount,"in28minutes","learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todosCount,"in28minutes","learn devOps",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todosCount,"in28minutes","learn Azure",LocalDate.now().plusYears(3),false));
		}
	public List<Todo> findByusername(String username){
		return todos;
	}
	public void addTodo(String username, String description , LocalDate targetDate , boolean done) {
	
		Todo todo=new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	}


