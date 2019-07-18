package elma.streetsandpits;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class DataAdder {

    @Autowired
    private StreetService streetService;

    @PostConstruct
    private void addData(){
        Street street = new Street();
        street.setName("AAAA");
        List<Pit>pits = street.getPitList();

        Pit pit = new Pit();
        pit.setStreet(street);

        Pit pit1 = new Pit();
        pit1.setStreet(street);

        pits.add(pit);
        pits.add(pit1);

        street.setPitList(pits);



        Street street1 = new Street();
        street1.setName("BBBB");
        List<Pit>pits1 = street1.getPitList();
        Pit pit2 = new Pit();
        pit2.setStreet(street1);
        Pit pit3 = new Pit();
        pit3.setStreet(street1);
        pits1.add(pit2);
        pits1.add(pit3);
        street1.setPitList(pits1);


        streetService.saveStreet(street);
        streetService.saveStreet(street1);
    }
}
