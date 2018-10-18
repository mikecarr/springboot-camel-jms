package net.mikecarr.springbootcameljms.routes;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author mcarr1
 * https://access.redhat.com/documentation/en-us/red_hat_jboss_fuse/6.2/html/apache_camel_development_guide/restservices-restdsl
 */
@Component
public class HttpListenRoute extends RouteBuilder {

	@Value("${httplisten.fromRoute}")
	private String fromRoute;

	@Value("${httplisten.toRoute}")
	private String toRoute;

	@Value("${httplisten.routeName}")
	private String routeName;
	
	@Value("${httplisten.restletPort}")
	private Integer restletPort;

	private static final String COMPONENT = "restlet";
	
//	@Autowired
//	private Processor myProcessor;

	@Override
	public void configure() throws Exception {
		restConfiguration().component(COMPONENT).port(restletPort);

		rest("/")
			.post("/hello")
			.route().log("Hello World")
			.to("direct:hello");
			


		//from("direct:hello").transform().constant("Hello World");

	}

}
