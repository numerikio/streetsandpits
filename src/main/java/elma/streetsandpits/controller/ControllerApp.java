package elma.streetsandpits.controller;

import elma.streetsandpits.model.Pit;
import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.PitService;
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

    @Autowired
    private PitService pitService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> list() {
        return new ResponseEntity<>(streetService.getAllStreets(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getStreet(@PathVariable Integer id) {
        return new ResponseEntity<>(streetService.getSreetById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addStreet(@RequestBody Street street) {
        return new ResponseEntity<>(streetService.saveStreet(street), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> addTip(@PathVariable Integer id) {
        return new ResponseEntity<>(streetService.addPit(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteTip(@PathVariable Integer id){
        pitService.deletePitByID(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

