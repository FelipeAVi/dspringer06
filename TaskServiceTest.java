/***************
* Name: Felipe Villegas
* Course: cs-320
* Date: aug 10
* Desc: test for class taskservice
***************/

package Test;

import static org.junit.jupiter.api.Assertion.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import Task.task;
import Task.TaskService;

class taskServiceTest {
	@Test
	@DisplayName("Test to Update task name")
	@Order(1)
	void testUpdateTaskname() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Description");
		service.updateTaskName("Updated Task Name", "3");
		service.displayTaskList();
		assertEquals("Updated Task Name", service.getTask("3").getTaskName(),"Task name was not updated.");
	}
	@Test
	@DisplayName("Test to Update task Description.")
	@Order(2)
	void testUpdatetaskDesc() {
		TaskService = new TaskService();
		service.addTask("Task Name", "description");
		service.updatetaskDesc("updated description", "1");
		service.displayTaskList();
		assertEquals("Updated description", service.getTask("1").gettaskDesc(), "task desctriptionwas not updated.");
	}
	@Test
	@DisplayName("Test to ensure that Service correctly deletes tasks.")
	@Order(5)
	void testDeleteContact() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Desctription");
		service.deleteTask("0");
		ArrayList<Task> taskListEmpty = new ArrayList<Task>();
		service.displayTaskList();
		assertEquals(service.taskList, taskListEmpty,"the contact was not deleted.");
	}
	@Test
	@DisplayName("Test to ensure that service can add a task.")
	@Order(6)
	void testAddContact() {
		TaskService service = new TaskService();
		service.addTask("Task Name", "Description");
		service.displayTaskList();
		assertNotNull(service.getTask("0"), "task was not added correctly.");
	}
}