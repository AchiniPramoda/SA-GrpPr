package feetpublisher;

public class FeetCalculator implements FeetConverter {

	float ans;
	
	@Override
	public float FeetToCenti(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val / 30.48);
		return ans;
	}

	@Override
	public float FeetToInch(float val) {
		// TODO Auto-generated method stub
		ans = val / 12;
		return ans;
	}

	@Override
	public float FeetToMeter(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val / 0.3048);
		return ans;
	}

	@Override
	public float FeetToMiles(float val) {
		// TODO Auto-generated method stub
		ans = (float) ((val / 0.1893)/10000);
		return ans;
	}

}
