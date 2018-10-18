package net.mikecarr.springbootcameljms;

import org.apache.camel.builder.RouteBuilder;

public class DispatcherRouteBuilder extends RouteBuilder {
	
	@Override
    public void configure() throws Exception {
        from("activemq:queue:EVENTS").to("log:Events?showAll=true");
    }
}
