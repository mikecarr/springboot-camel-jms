package net.mikecarr.springbootcameljms.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleRoute extends RouteBuilder {

	@Value("${simpleRouter.fromRoute}")
	private String fromRoute;
	
	@Value("${simpleRouter.toRoute}")
	private String toRoute;
	
	@Value("${simpleRouter.routeName}")
	private String routeName;
	
	@Override
	public void configure() throws Exception {
		from(fromRoute)
		.routeId(routeName)
		.log("Camel body: ${body}")
		.to(toRoute);
		
	}

}
