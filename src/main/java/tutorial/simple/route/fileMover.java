package tutorial.simple.route;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class fileMover extends SpringRouteBuilder {

	private final String inputDirectory = "c:\\dev\\poc\\input";
	private final String outputDirectory = "c:\\dev\\poc\\output";
	
	@Override
	public void configure() throws Exception {
		from("file:" + inputDirectory).to("file:" + outputDirectory);		
	}

}
