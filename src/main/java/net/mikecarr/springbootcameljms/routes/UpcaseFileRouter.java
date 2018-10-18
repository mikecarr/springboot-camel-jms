package net.mikecarr.springbootcameljms.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import net.mikecarr.springbootcameljms.MyProcessor;

@Component
public class UpcaseFileRouter extends RouteBuilder {

	@Value("${upcaseFileRouter.fromRoute}")
	private String fromRoute;
	
	@Value("${upcaseFileRouter.toRoute}")
	private String toRoute;
	
	@Value("${upcaseFileRouter.routeName}")
    private String routeName;
    
    @Autowired
    private MyProcessor processor;
	
	@Override
	public void configure() throws Exception {
		from(fromRoute)
        .routeId(routeName)
        .log("Before body: ${body}")
        .process(processor)
		.log("After body: ${body}")
		.to(toRoute);
		
	}

}
