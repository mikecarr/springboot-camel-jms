package net.mikecarr.springbootcameljms;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub

		String originalFileContent = (String) exchange.getIn().getBody(String.class);
		String upperCaseFileContent = originalFileContent.toUpperCase();
		exchange.getIn().setBody(upperCaseFileContent);

	}

}
