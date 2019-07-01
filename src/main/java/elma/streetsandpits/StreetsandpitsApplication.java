package elma.streetsandpits;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreetsandpitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreetsandpitsApplication.class, args);
	}

}
