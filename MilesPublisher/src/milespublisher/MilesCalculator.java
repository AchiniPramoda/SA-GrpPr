package milespublisher;

public class MilesCalculator implements MilesConverter {

	float ans;
	@Override
	public float MilesToCenti(float val) {
		// TODO Auto-generated method stub
		ans = val * 160934;
		return ans;
	}

	@Override
	public float MilesToInch(float val) {
		// TODO Auto-generated method stub
		ans = val * 63360;
		return ans;
	}

	@Override
	public float MilesToFeet(float val) {
		// TODO Auto-generated method stub
		ans = val * 5280;
		return ans;
	}

	@Override
	public float MilesToMeter(float val) {
		// TODO Auto-generated method stub
		ans = (float) (val * 1609.3);
		return ans;
	}

}
