package lengthconverter;

import centimeterpublisher.CentimeterConverter;
import feetpublisher.FeetConverter;
import inchesconverter.InchesConverter;
import metersconverter.MetersConverter;
import milespublisher.MilesConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceRegistration registration;
	
	@SuppressWarnings("rawtypes")
	private static ServiceTracker cmTracker, meterTracker, inchTracker, feetTracker, milesTracker;
	
	private static CentimeterConverter centimeterConverter;
	private static MetersConverter meterConverter;
	private static InchesConverter inchConverter;
	private static FeetConverter feetConverter;
	private static MilesConverter milesConverter;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Length Converter Service Started...");
		
		LengthConverter converter = new LengthConverterImp();
		registration = context.registerService(LengthConverter.class.getName(), converter, null);
		
		cmTracker = new ServiceTracker(context, CentimeterConverter.class.getName(), null);
		meterTracker = new ServiceTracker(context, MetersConverter.class.getName(), null);
		inchTracker = new ServiceTracker(context, InchesConverter.class.getName(), null);
		feetTracker = new ServiceTracker(context, FeetConverter.class.getName(), null);
		milesTracker = new ServiceTracker(context, MilesConverter.class.getName(), null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Length Converter Service Stopped...");
		registration.unregister();
	}
	
	public static boolean cmClicker() {
		cmTracker.open();
		centimeterConverter = (CentimeterConverter) cmTracker.getService();
		
		if (centimeterConverter != null) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public static boolean meterClicker() {
		meterTracker.open();
		meterConverter = (MetersConverter) meterTracker.getService();
		
		if (meterConverter != null) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public static boolean inchClicker() {
		inchTracker.open();
		inchConverter = (InchesConverter) inchTracker.getService();
		
		if (inchConverter != null) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public static boolean feetClicker() {
		feetTracker.open();
		feetConverter = (FeetConverter) feetTracker.getService();
		
		if (feetConverter != null) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public static boolean milesClicker() {
		milesTracker.open();
		milesConverter = (MilesConverter) milesTracker.getService();
		
		if (milesConverter != null) {
			return true;
			
		} else {
			return false;
		}
	}
}
