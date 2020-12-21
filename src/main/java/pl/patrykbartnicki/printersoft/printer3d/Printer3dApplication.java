package pl.patrykbartnicki.printersoft.printer3d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"pl\\patrykbartnicki\\printersoft\\printer3d\\service\\"})
public class Printer3dApplication {

	public static void main(String[] args) {
		SpringApplication.run(Printer3dApplication.class, args);
	}

}
