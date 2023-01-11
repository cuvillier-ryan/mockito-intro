package com.remcee.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

	public List<String> retrieveToDo(String usr) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}

}
