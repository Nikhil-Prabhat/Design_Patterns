package Abstract_Factory;

// Creating AudiFactory and extending superclass "Factory"
public class AudiFactory extends Factory {

	// Creating Audi Headlight
	@Override
	public Headlight makeHeadLight() {
		return new AudiHeadlight();
	}

	// Creating Audi Tire
	@Override
	public Tire makeTire() {
		return new AudiTyre();
	}

}
