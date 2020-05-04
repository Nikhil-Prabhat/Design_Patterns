package Chain_Of_Responsibility;

public class LeaveRequest {

	public String Employee;
	public int LeaveDays;

	public LeaveRequest() {
		super();
	}

	public LeaveRequest(String employee, int leaveDays) {
		super();
		Employee = employee;
		LeaveDays = leaveDays;
	}

	public String getEmployee() {
		return Employee;
	}

	public void setEmployee(String employee) {
		Employee = employee;
	}

	public int getLeaveDays() {
		return LeaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}

	@Override
	public String toString() {
		return "LeaveRequest [Employee=" + Employee + ", LeaveDays=" + LeaveDays + "]";
	}
	
	

}
