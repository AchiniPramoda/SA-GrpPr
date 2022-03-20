package mainconverter;

public class ConverterMain implements Converter {
	
	ConverterDisplay display;

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		display = new ConverterDisplay();
		display.setVisible(true);
	}

}
