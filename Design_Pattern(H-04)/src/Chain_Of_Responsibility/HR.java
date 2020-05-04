package Chain_Of_Responsibility;

public class HR implements ILeaveRequestHandler {

	public HR() {
	}

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {

		if (leaveRequest.getLeaveDays() > 5)
			System.out.println("HR approves the leave for " + leaveRequest.getEmployee() + " for "
					+ leaveRequest.getLeaveDays() + " days");
	}

}
