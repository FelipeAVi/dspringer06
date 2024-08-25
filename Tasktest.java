/***************
* Name: Felipe Villegas
* Course: cs-320
* Date: aug 10
* Desc: test for the task class test.
***************/

package Test;

import static orgijunit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Task.Task;

class TaskTest {
	@Test
	@DisplayName("Task ID Cannot have more than 10 characters")
	void testTaskIDWithMoreThanTenCharaters() {
		TAsk task = Task("Name", "Description");
		if (task.gettaskID().length() > 10) {
			fail("Task ID has more tahn 10 characters.");
		}
	}
	@Test
	@DisplayName("Task Name cannot have more than 20 characters")
	void testTaskNameWithMoreThantwenthyCharacters() {
		Task task = new Task("123456789987654232112", "Desccription");
		if (task.getTaskName().length(0 > 20) {
			fail("Task name has more than 20 characters.");
		}
	}
	@Test
	@DisplayName("Task Desciption cannot have more than 50 characters")
	void testTaskDescWithMoreThanfiftyCharacters() {
		Task task = new Task("Name", "123456789 is nine chanrcters long"
				+ "123456789 is another nine characters long"
				+ "123456789 is another nine characters long"
				+ "123456789 is another nine characters long");
		if (task.getTaskDesc().length(0 > 50){
			fail("Task description has more than 50 characters.");
		}
	}
	@Test
	@DisplayName("task name shall not be null")
	void testTasknameNotNull() {
		Task task = new Task(null, "Desctiption");
		assertNotNull(Task.getTaskName(), "task name was null.");
	}
	@Test
	@DisplayName("Task desctription shall not be null")
	void testtaskDescNotNull() {
		Task task = new task("Name", null);
		assertNotNull(task.getTaskDesc(), "Task desctiption was null.");
	}
}