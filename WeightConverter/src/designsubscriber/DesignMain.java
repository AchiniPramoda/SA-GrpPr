package designsubscriber;

public class DesignMain implements DesignMenu{
	Design_Menu menu ;
	
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		menu = new Design_Menu();
		menu.setVisible(true);
		
	}
	
	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		menu.dispose();
		
	}

}
