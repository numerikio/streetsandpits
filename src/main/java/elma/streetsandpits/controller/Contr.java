package elma.streetsandpits.controller;

import elma.streetsandpits.Response;
import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Contr  {

    @Autowired
    StreetService streetService;

    @RequestMapping("/add")
    public Response uploadMultipleFiles(@RequestParam(value="name") String name) {
        Street street = new Street();
        street.setName(name);

        Pit pit = new Pit();
        pit.setStreet(street);
        List<Pit>pits = street.getPitList();
        pits.add(pit);
        street.setPitList(pits);
        streetService.saveStreet(street);

        Response response = new Response();
        response.setId(street.getId());
        response.setName(street.getName());

        return response;
    }

}
