package ouncesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import ouncepublisher.OunceConverter;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference;
	
	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("");
		
		reference = context.getServiceReference(OunceConverter.class.getName());
		OunceConverter converter = (OunceConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("");
		context.ungetService(reference);
	}
}
