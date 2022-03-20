package gramssubscriber;

import gramspublisher.GramsConverter;
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
		System.out.println("Grams Converter Subscriber Started...");
		
		reference = context.getServiceReference(GramsConverter.class.getName());
		GramsConverter converter = (GramsConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Grams Converter Subscriber Stopped...");
		context.ungetService(reference);
	}

}
