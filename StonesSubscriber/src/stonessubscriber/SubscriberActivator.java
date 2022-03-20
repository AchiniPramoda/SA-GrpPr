package stonessubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import stonespublisher.StonesConverter;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference;
	
	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Stones Converter Subscriber Started...");
		
		reference = context.getServiceReference(StonesConverter.class.getName());
		StonesConverter converter = (StonesConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Stones Converter Subscriber Stopped...");
		context.ungetService(reference);
	}
}
