package metersconverter;

public class MetersCalculator implements MetersConverter {

	float ans;
	
	@Override
	public float MetersToCenti(float val) {
		// TODO Auto-generated method stub
		ans = val * 100;
		return ans;
	}

	@Override
	public float MetersToInch(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.0254);
		return ans;
	}

	@Override
	public float MetersToFeet(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.3048);
		return ans;
	}

	@Override
	public float MetersToMiles(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 1609.344);
		return ans;
	}

}
