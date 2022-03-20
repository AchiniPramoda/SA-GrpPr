package gramspublisher;

public class GramsCalculator implements GramsConverter {
	float ans;

	@Override
	public float GramsToPounds(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 2.20462 / 1000);
		return ans;
	}

	@Override
	public float GramsToStones(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 0.157473 / 1000);
		return ans;
	}

	@Override
	public float GramsToKilograms(float val) {
		// TODO Auto-generated method stub
		ans = val / 1000;
		return ans;
	}

	@Override
	public float GramsToOunce(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 35.274 / 1000);
		return (float) 4.0;
	}

}
