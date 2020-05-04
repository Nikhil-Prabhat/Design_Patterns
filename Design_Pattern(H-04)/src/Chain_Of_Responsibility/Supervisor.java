package Chain_Of_Responsibility;

public class Supervisor implements ILeaveRequestHandler {
	
	private ILeaveRequestHandler nextHandler;
	
	

	public Supervisor(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays() <= 3 )
		{
			System.out.println("Supervisor approves the leave for "+ leaveRequest.getEmployee() + " for " + leaveRequest.getLeaveDays() + " days" );
		}
		else
		{
			nextHandler.HandleRequest(leaveRequest);
		}
		
	}

}
