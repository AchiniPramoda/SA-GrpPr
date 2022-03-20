package milessubscriber;

import milespublisher.MilesConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference;
	
	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Miles Converter Subscriber Started...");
		
		reference = context.getServiceReference(MilesConverter.class.getName());
		MilesConverter converter = (MilesConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Miles Converter Subscriber Stopped...");
		context.ungetService(reference);
	}
}
