package Abstract_Factory;

//Creating Factory Producer to genereate apporpriate factories
public class FactoryProducer {

	public static Factory getFactory(String factoryType)
	{
		if(factoryType.equalsIgnoreCase("Mercedes"))
		{
			return new MercedesFactory();
		}
		else if(factoryType.equalsIgnoreCase("Audi"))
		{
			return new AudiFactory();
		}
		else
		{
		return null;
		}
	}
	
}
