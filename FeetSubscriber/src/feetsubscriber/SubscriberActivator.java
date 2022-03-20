package feetsubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import feetpublisher.FeetConverter;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference;
	
	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Feet Converter Subscriber Started...");
		
		reference = context.getServiceReference(FeetConverter.class.getName());
		
		FeetConverter converter = (FeetConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Feet Converter Subscriber Stopped...");
		context.ungetService(reference);
	}
}
