package net.mikecarr.springbootcameljms.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class ErrorHandlerRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("seda:a")
			.errorHandler(loggingErrorHandler("mylogger.name")
			.level(LoggingLevel.DEBUG))
			.to("file://logger.log");
		
	}

}
