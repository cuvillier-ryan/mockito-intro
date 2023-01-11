package com.remcee.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.remcee.data.api.ToDoService;
import com.remcee.data.api.ToDoServiceStub;

public class ToDoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		
		ToDoService toDoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);
		
		List<String> filteredToDos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy User");
		
		assertEquals(2, filteredToDos.size());

	}

}
