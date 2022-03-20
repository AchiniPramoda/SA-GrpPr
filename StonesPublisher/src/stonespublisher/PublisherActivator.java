package stonespublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceRegistration registration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Stones Converter Publisher Started...");
		
		StonesConverter converter = new StonesCalculator();
		registration = context.registerService(StonesConverter.class.getName(), converter, null);
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Stones Converter Publisher Stopped...");
		
		registration.unregister();		
	}

}
