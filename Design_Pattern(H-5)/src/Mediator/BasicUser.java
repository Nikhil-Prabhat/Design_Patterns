package Mediator;

public class BasicUser implements IUser {
	private IChatMediator chatmediator;
	private String name;

	public BasicUser(IChatMediator chatmediator, String name) {
		super();
		this.chatmediator = chatmediator;
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String msg) {
		System.out.println("[Basic User] "+ this.name + " is receiving the message:\t"+msg);

	}

	@Override
	public void SendMessage(String msg) {
		System.out.println("[Basic User] "+this.name + " is sending the message:\t"+msg);
		chatmediator.SendMessage(msg);
	}

}
