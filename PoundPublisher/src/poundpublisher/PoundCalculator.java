package poundpublisher;

public class PoundCalculator implements PoundConverter {
	float ans;

	@Override
	public float PoundToKilograms(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val / 2.20462);
		return ans;
	}

	@Override
	public float PoundToStones(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val / 14);
		return ans;
	}

	@Override
	public float PoundToGrams(float val) {
		// TODO Auto-generated method stub
		ans = (float) ((val / 2.2046)*1000);
		return ans;
	}

	@Override
	public float PoundToOunce(float val) {
		// TODO Auto-generated method stub
		ans = val * 16;
		return ans;
	}

}
