package stonespublisher;

public class StonesCalculator implements StonesConverter {
	float ans;

	@Override
	public float StonesToPounds(float val) {
		// TODO Auto-generated method stub
		ans = val * 14;
		return ans;
	}

	@Override
	public float StonesToKilograms(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 6.35029);
		return ans;
	}

	@Override
	public float StonesToGrams(float val) {
		// TODO Auto-generated method stub
		ans = (float) ((val * 6.35029) * 1000);
		return ans;
	}

	@Override
	public float StonesToOunce(float val) {
		// TODO Auto-generated method stub
		ans = val * 224;
		return ans;
	}

}
