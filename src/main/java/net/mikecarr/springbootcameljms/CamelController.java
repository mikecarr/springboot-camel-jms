package net.mikecarr.springbootcameljms;

import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
public class CamelController {

	@Autowired
	ProducerTemplate producerTemplate;
	
	private static Logger logger = LoggerFactory.getLogger(CamelController.class);

	@RequestMapping(value = "/hello")
	public void startCamel() {
		//producerTemplate.sendBody("direct:firstRoute", "Calling via Spring Boot Rest Controller");
		logger.debug("Here we are");
		
	}

}
