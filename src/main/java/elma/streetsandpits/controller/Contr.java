package elma.streetsandpits.controller;

import elma.streetsandpits.model.Street;
import elma.streetsandpits.service.StreetService;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/street")
public class Contr {

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
}
