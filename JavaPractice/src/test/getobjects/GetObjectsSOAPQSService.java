
package test.getobjects;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetObjectsSOAPQSService", targetNamespace = "http://www.resourcesmanager.com", wsdlLocation = "http://10.5.24.25:8012/ResourcesManager/FSP/GetObjects?wsdl")
public class GetObjectsSOAPQSService extends Service {

	public final static QName GETOBJECTSSOAPQSSERVICE_QNAME = new QName("http://www.resourcesmanager.com",
			"GetObjectsSOAPQSService");

	public GetObjectsSOAPQSService(URL wsdlLocation) {
		super(wsdlLocation, GETOBJECTSSOAPQSSERVICE_QNAME);
	}

	public GetObjectsSOAPQSService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	/**
	 * 
	 * @return returns GetObjects
	 */
	@WebEndpoint(name = "GetObjectsSOAPQSPort")
	public GetObjects getGetObjectsSOAPQSPort() {
		return super.getPort(new QName("http://www.resourcesmanager.com", "GetObjectsSOAPQSPort"), GetObjects.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link WebServiceFeature} to configure on
	 *            the proxy. Supported features not in the <code>features</code>
	 *            parameter will have their default values.
	 * @return returns GetObjects
	 */
	@WebEndpoint(name = "GetObjectsSOAPQSPort")
	public GetObjects getGetObjectsSOAPQSPort(WebServiceFeature... features) {
		return super.getPort(new QName("http://www.resourcesmanager.com", "GetObjectsSOAPQSPort"), GetObjects.class,
				features);
	}

}
