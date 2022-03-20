package poundsubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import poundpublisher.PoundConverter;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference ;
	
	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pound Converter Subscriber Started...");
		
		reference = context.getServiceReference(PoundConverter.class.getName());
		PoundConverter poundConverter = (PoundConverter) context.getService(reference);
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pound Converter Subscriber Stopped...");
		context.ungetService(reference); 
	}

}
