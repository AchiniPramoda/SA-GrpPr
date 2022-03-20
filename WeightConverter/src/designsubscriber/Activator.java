package designsubscriber;

import gramspublisher.GramsConverter;
import kilospublisher.KilogramsConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import ouncepublisher.OunceConverter;
import poundpublisher.PoundConverter;
import stonespublisher.StonesConverter;

public class Activator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	public ServiceRegistration registration;
	
	@SuppressWarnings("rawtypes")	
	public static ServiceTracker poundTracker, stonesTracker, kilosTracker, gramsTracker, ounceTracker;
	public static PoundConverter poundConverter;
	public static StonesConverter stonesConverter;
	public static KilogramsConverter kilogramsConverter;
	public static GramsConverter gramsConverter;
	public static OunceConverter ounceConverter;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Weight Converter Service Started...");
		
		DesignMenu menu = new DesignMain();
		registration = context.registerService(DesignMenu.class.getName(), menu, null);
		
		poundTracker = new ServiceTracker(context, PoundConverter.class.getName(), null);
		stonesTracker = new ServiceTracker(context, StonesConverter.class.getName(), null);
		kilosTracker = new ServiceTracker(context, KilogramsConverter.class.getName(), null);
		gramsTracker = new ServiceTracker(context, GramsConverter.class.getName(), null);
		ounceTracker = new ServiceTracker(context, OunceConverter.class.getName(), null);
		
		//menu.Start();
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Sevice Stopped...");
		registration.unregister();
		
	}
	
	public static boolean poundClicker() {
		poundTracker.open(); 
		poundConverter = (PoundConverter) poundTracker.getService();
		
		if(poundConverter != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean stonesClicker() {
		stonesTracker.open();
		stonesConverter = (StonesConverter) stonesTracker.getService();
		
		if(stonesConverter != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean kilosClicker() {
		kilosTracker.open();
		kilogramsConverter = (KilogramsConverter) kilosTracker.getService();
		
		if (kilogramsConverter != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean gramsClicker() {
		gramsTracker.open();
		gramsConverter = (GramsConverter) gramsTracker.getService();
		
		if (gramsConverter != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean ounceClicker() {
		ounceTracker.open();
		ounceConverter = (OunceConverter) ounceTracker.getService();
		
		if (ounceConverter != null) {
			return true;
		} else {
			return false;
		}
	}

}
