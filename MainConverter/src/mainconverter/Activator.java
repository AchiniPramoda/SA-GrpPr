package mainconverter;

import designsubscriber.DesignMenu;
import lengthconverter.LengthConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceRegistration registration ;
	
	@SuppressWarnings("rawtypes")
	private static ServiceTracker weightTracker, lengthTracker;
	
	private static DesignMenu designMenu;
	private static LengthConverter lengthConverter;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service Started...");
		
		Converter converter = new ConverterMain();
		registration = context.registerService(Converter.class.getName(), converter, null);
		
		weightTracker = new ServiceTracker(context, DesignMenu.class.getName(), null);
		lengthTracker = new ServiceTracker(context, LengthConverter.class.getName(), null);
		
		converter.Start();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service Stopped...");
		registration.unregister();		
	}
	
	public static boolean weightClicker() {
		weightTracker.open();
		designMenu = (DesignMenu) weightTracker.getService();
		
		if (designMenu != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean lengthClicker() {
		lengthTracker.open();
		lengthConverter = (LengthConverter) lengthTracker.getService();
		
		if (lengthConverter != null) {
			return true;
			
		} else {
			return false;
		}
	}
}
