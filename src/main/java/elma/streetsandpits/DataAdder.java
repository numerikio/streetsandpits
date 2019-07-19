package elma.streetsandpits;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.PitService;
import elma.streetsandpits.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class DataAdder {

    @Autowired
    private StreetService streetService;

    @Autowired
    private PitService pitService;

    @PostConstruct
    private void addData(){

        Street street = new Street();
        street.setName("вул. Данила Щербаківського");

        Street street1 = new Street();
        street1.setName("вул. Борщагівська");

        streetService.saveStreet(street);
        streetService.saveStreet(street1);
    }
}
