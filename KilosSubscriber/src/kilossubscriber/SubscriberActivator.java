package kilossubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import kilospublisher.KilogramsConverter;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference;
	
	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Kilograms Converter Subscriber Started...");
		
		reference = context.getServiceReference(KilogramsConverter.class.getName());
		KilogramsConverter converter = (KilogramsConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Kilograms Converter Subscriber Stopped...");
		context.ungetService(reference);
	}

}
