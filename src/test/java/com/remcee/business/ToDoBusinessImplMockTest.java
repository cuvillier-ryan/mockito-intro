package com.remcee.business;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.remcee.data.api.ToDoService;

public class ToDoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {

		ToDoService toDoServiceMock = mock(ToDoService.class);

		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

		when(toDoServiceMock.retrieveToDo("Dummy User")).thenReturn(todos);

		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);

		List<String> filteredToDos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy User");

		assertEquals(2, filteredToDos.size());

	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingBDD() {
		
		//Given
		ToDoService toDoServiceMock = mock(ToDoService.class);

		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

		given(toDoServiceMock.retrieveToDo("Dummy User")).willReturn(todos);

		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		
		//When
		List<String> filteredToDos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy User");

		//Then
		assertThat(filteredToDos.size(), equalTo(2));

	}
}
