package centimetersubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import centimeterpublisher.CentimeterConverter;

public class SubscriberActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceReference reference;
	
	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Centimeter Converter Subscriber Started...");
		
		reference = context.getServiceReference(CentimeterConverter.class.getName());
		CentimeterConverter converter = (CentimeterConverter) context.getService(reference);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Centimeter Converter Subscriber Stopped...");
		context.ungetService(reference);		
	}
}
