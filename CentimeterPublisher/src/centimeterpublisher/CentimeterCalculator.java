package centimeterpublisher;

public class CentimeterCalculator implements CentimeterConverter {
	float ans;

	@Override
	public float CnetiToMeter(float val) {
		// TODO Auto-generated method stub
		ans = val / 100;
		return ans;
	}

	@Override
	public float CnetiToInch(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val / 2.54);
		return ans;
	}

	@Override
	public float CnetiToFeet(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val / 30.48);
		return ans;
	}

	@Override
	public float CnetiToMiles(float val) {
		// TODO Auto-generated method stub
		ans = val / 160934;
		return ans;
	}

}
