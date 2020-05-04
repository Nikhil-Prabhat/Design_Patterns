package AdapterFactory;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	
	
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	@Override
	public double getPrice() {
		return convertUSDollartoEuro(luxuryCars.getPrice());
	}
	
	private double convertMPHtoKMPH(double mph)
	{
		return mph*1.60934;
	}
	
	private double convertUSDollartoEuro(double price)
	{
		return price* (0.91);
	}

	
	
	
	
	
	
}
