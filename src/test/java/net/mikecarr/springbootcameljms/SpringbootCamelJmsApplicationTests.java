package net.mikecarr.springbootcameljms;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.apache.camel.test.spring.MockEndpoints;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootCamelJmsApplicationTests {



	@Test
	public void test() throws InterruptedException {
		//String body = "Camel";
		//mockCamel.expectedMessageCount(1);

		//producerTemplate.sendBody("http://localhost:8080", body);

		//mockCamel.assertIsSatisfied();
	}


}
