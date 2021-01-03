package pl.patrykbartnicki.printersoft.printer3d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan("pl/patrykbartnicki/printersoft/printer3d")
public class Printer3dApplication {

	public static void main(String[] args) {
		SpringApplication.run(Printer3dApplication.class, args);
	}

}