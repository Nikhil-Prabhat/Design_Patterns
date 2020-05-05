package Mediator;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args)
	{
	
	ChatMediator cm = new ChatMediator(new ArrayList<>());
	
	  BasicUser bu1 = new BasicUser(cm, "Harry");
	  PremiumUser pu1 = new PremiumUser(cm,"Ben"); 
	  PremiumUser source = new PremiumUser(cm, "Potter");
	 
	
	  cm.AddUser(bu1);
	  cm.AddUser(pu1);
	  source.SendMessage("Hii everyone, This is important message, Please pay attention");
	}

}
