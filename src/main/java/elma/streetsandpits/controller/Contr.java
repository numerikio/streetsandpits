package elma.streetsandpits.controller;

import elma.streetsandpits.Response;
import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Contr {

    @Autowired
    private StreetService streetService;

    @PostMapping("/streets")
    public void addStreet(@RequestBody Street street) {
        Street newStreet = new Street();
        street.setName(street.getName());
        streetService.saveStreet(newStreet);
    }

}
