package elma.streetsandpits.controller;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/street")
public class ControllerApp {

    @Autowired
    private StreetService streetService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> list() {
        return new ResponseEntity<>(streetService.getAllStreets(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getStreet(@PathVariable Integer id) {
        Street street = streetService.getSreetById(id);
        System.out.println(street);
        return new ResponseEntity<>(street, HttpStatus.OK);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addStreet(@RequestBody Street street) {
        Street newStreet = new Street();
        newStreet.setName(street.getName());
        streetService.saveStreet(newStreet);
        return new ResponseEntity<>(newStreet, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> addTip(@PathVariable Integer id) {
        System.out.println(id);
        Street s = streetService.getSreetById(id);
        Pit pit = new Pit();
        pit.setStreet(s);
        s.getPitList().add(pit);
        streetService.saveStreet(s);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}

