/*************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9th
* Description: able to add and complete tasks as needed.
*************/

package Task;

import java.util.ArrayList;

public class TaskService{
	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	public void displayTaskList() {
		for (int counter = 0; counter < taskList.size(); counter++) {
			System.out.println("\t Task ID: " + taskList.get(counter).getTaskID());
			System.out.println("\t Task Name: " + taskList.get(counter).getTaskName());
			System.out.println("\t Task Description: " + taskList.get(counter).getTaskDesc());
		}
	}
	public void addTask(String taskName, String taskDesc) {
		Task task = new Task(taskName, taskDesc);
		taskList.add(task);
	}
	public Task getTask(String taskID) {
		Task task = new Task(null, null);
		for (int counter = 0; counter <taskList.size(); counter++) {
			if(taskList.get(counter).getTaskID().contentEquals(taskID)) {
				task = taskList.get(counter);
			}
		}
		return task;
	}
	public void deleteTask(String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if(taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.remove(counter);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " taskID + " not available.");
			}
		}
	}
	public void updateTaskName(String updatedString, String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.get(counter).setTaskName(updatedString);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not available.");
			}
		}
	}
	public void updateTaskDesc(String updatedString, String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.get(counter).setTaskDesc(updatedString);
				break;
			}
			if (counter == taskList.size() - 1) {
				System,.out.println("Task ID: " + taskID + " not available.");
			}
		}
	}
}