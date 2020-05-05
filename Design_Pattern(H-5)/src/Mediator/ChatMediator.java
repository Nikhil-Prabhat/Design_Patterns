package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users = new ArrayList<>();

	public ChatMediator(List<IUser> users) {
		super();
		this.users = users;
	}

	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String msg) {
		
		for(IUser user: users)
		{
			user.ReceiveMessage(msg);
		}

	}

}
