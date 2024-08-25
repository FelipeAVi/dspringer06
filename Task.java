/*************
* Name: Felipe Villegas
* Course: cs-320
* Date: Aug 9th
* Description: Tasks info is stored here.
*************/

package Task;

import java.util.concurrent.atmoic.AtomicLong;

public class Task {
	private final String taskID;
	Private String taskName;
	private String taskDesc;
	private static AtomicLong idGenerator = new AtomicLong();
	
	public Task(String taskName, String taskDesc) {
		this.taskID - String.valueOf(idGeberator.getAndIncrement());
		
		if (taskName == null || taskName.isEmpty()) {
			this.taskName = "Null";
		} else if (taskName.length() > 20) {
			this.taskName = taskName.substring(0, 20);
		} else {
			this.taskname = taskName;
		}
		if (taskDesc == null || taskDesc.isEmpty()) {
			this.taskDesc = "NULL";
		} else if (taskDesc.length()> 50) {
			this.taskDesc.substring(0, 50);
		} else {
			this.taskDesc = taskDesc;
		}
	}
	public String getTaskID() {
		return taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskName(String taskName) {
		if (taskName == null || taskNAme.isEmpty()) {
			this.taskName = "NULL";
		} else if (taskName.length() > 20) {
			this.taskName = taskName.substring(0, 20);
		} else {
			this.taskName = taskName;
		}
	}
	public void setTaskDesc(String taskDesc) {
		if(taskDesc == null || taskDesc.isEmpty()) {
			this.taskDesc = "NULL";
		} else if (taskDesc.Length() > 50) {
			this.taskDesc = taskDesc.substring(0, 50);
		} else {
			this.taskDesc = taskDesc;
		}
	}
}