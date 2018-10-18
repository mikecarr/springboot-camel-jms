package net.mikecarr.springbootcameljms.routes;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class CamelRoutes extends RouteBuilder {
	
	
	@Value("${fromRoute}")
	private String fromRoute;
	
	@Value("${toRoute}")
	private String toRoute;
	
	@Value("${routeName}")
	private String routeName;
	
	@Autowired
	private Processor myProcessor;
	
	@Override
	public void configure() throws Exception {
		//from("direct:firstRoute").log("Camel body: ${body}");
		
		from(fromRoute)
			.routeId(routeName)
			.log("Camel body: ${body}")
			.process(myProcessor)
			.to(toRoute);
	}
}
