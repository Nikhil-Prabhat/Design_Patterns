package AdapterFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestClass {
	
	@Test
	public void whenConvertingMPHtoKMPH_thenSuccessfullyConverted()
	{
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		
		assertEquals(bugattiVeyronAdapter.getSpeed(),431.30312,0.00001);
	}
	
	@Test
	public void whenConvertingUSDollarToEuro_thenSuccessfullyConverted()
	{
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		
		assertEquals(bugattiVeyronAdapter.getPrice(),910,0.0f);
	}

}
