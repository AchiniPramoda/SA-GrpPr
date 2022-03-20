package metersconverter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceRegistration registration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Meters Converter Publisher Started...");
		
		MetersConverter converter = new MetersCalculator();
		registration = context.registerService(MetersConverter.class.getName(), converter, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Meters Converter Publisher Stopped...");
		registration.unregister();
	}
}
