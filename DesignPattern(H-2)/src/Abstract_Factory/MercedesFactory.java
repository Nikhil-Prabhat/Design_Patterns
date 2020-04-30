package Abstract_Factory;

// Creating MercedesFactory class and extending superclass "Factory"
public class MercedesFactory extends Factory {

	// Creating Mercedes Headlight
	@Override
	public Headlight makeHeadLight() {
		return new MercedesHeadlight();
	}

	// Creating Mercedes Tire
	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
