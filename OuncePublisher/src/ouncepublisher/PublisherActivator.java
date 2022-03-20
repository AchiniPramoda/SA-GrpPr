package ouncepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceRegistration registration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ounce Converter Publisher Started...");
		
		OunceConverter converter = new OunceCalculator();
		registration = context.registerService(OunceConverter.class.getName(), converter, null);
	}
	
	@Override
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ounce Converter Publisher Stopped...");
		registration.unregister();
	}
}
