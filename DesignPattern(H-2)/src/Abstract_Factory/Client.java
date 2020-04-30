package Abstract_Factory;

public class Client 
{

	public static void main(String[] args)
	{
		//Validation of Mercedes Factory
		Factory Mercedes = FactoryProducer.getFactory("Mercedes");
		Mercedes.makeHeadLight();
		Mercedes.makeTire();
		
		
		//Validation of Audi Factory
		Factory Audi = FactoryProducer.getFactory("Audi");
		Audi.makeHeadLight();
		Audi.makeTire();
		
	}

}
