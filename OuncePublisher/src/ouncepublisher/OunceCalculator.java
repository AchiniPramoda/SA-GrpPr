package ouncepublisher;

public class OunceCalculator implements OunceConverter {
	float ans;

	@Override
	public float OunceToPound(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.0625);
		return ans;
	}

	@Override
	public float OunceToKilograms(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.0283495);
		return ans;
	}

	@Override
	public float OunceToGrams(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 28.3495);
		return ans;
	}

	@Override
	public float OunceToStones(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.00446429);
		return ans;
	}

}
