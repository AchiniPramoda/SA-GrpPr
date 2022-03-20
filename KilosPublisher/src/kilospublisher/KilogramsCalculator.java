package kilospublisher;

public class KilogramsCalculator implements KilogramsConverter {
	float ans;

	@Override
	public float KilogramsToPounds(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 2.20462);
		return ans;
	}

	@Override
	public float KilogramsToStones(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.157473);
		return ans;
	}

	@Override
	public float KilogramsToGrams(float val) {
		// TODO Auto-generated method stub
		ans = val * 1000;
		return ans;
	}

	@Override
	public float KilogramsToOunce(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 35.274);
		return ans;
	}

}
