package Chain_Of_Responsibility;

public class ProjectManager implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextHandler;
	
	
	
	public ProjectManager(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}



	@Override
	public void HandleRequest(LeaveRequest leaveRequest) 
	{
		if(leaveRequest.getLeaveDays() > 3 && leaveRequest.getLeaveDays() <= 5 )
		{
			System.out.println("Project Manager approves the leave for "+ leaveRequest.getEmployee() + " for " + leaveRequest.getLeaveDays() + " days" );
		}
		else
		{
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
