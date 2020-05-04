package Chain_Of_Responsibility;

public class Program {
	
	public static ILeaveRequestHandler getChainsOfRequestHandlers()
	{
		HR hr = new HR();
		ProjectManager projectManager = new ProjectManager(hr);
		Supervisor supervisor = new Supervisor(projectManager);
		
		return supervisor;
	}
	
	
	public static void main(String[] args)
	{
		LeaveRequest lr1 = new LeaveRequest("Harry",2);
		LeaveRequest lr2 = new LeaveRequest("Potter",4);
		LeaveRequest lr3 = new LeaveRequest("Ben",6);
		
		ILeaveRequestHandler RequestHandlers = getChainsOfRequestHandlers();
		RequestHandlers.HandleRequest(lr1);
		RequestHandlers.HandleRequest(lr2);
		RequestHandlers.HandleRequest(lr3);
		
	}
	

}
