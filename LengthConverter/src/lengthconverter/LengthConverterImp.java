package lengthconverter;

public class LengthConverterImp implements LengthConverter {
	
	private LengthConvertDisplay display;

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		display = new LengthConvertDisplay();
		display.setVisible(true);
	}

}
