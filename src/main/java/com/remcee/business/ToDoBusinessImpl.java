package com.remcee.business;

import java.util.ArrayList;
import java.util.List;

import com.remcee.data.api.ToDoService;

// ToDoBusinessImpl SUT
public class ToDoBusinessImpl {
	
	private ToDoService todoService;
	
	public ToDoBusinessImpl(ToDoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String usr){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveToDo(usr);
		
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}
}
