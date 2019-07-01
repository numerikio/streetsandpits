package elma.streetsandpits.service;

import elma.streetsandpits.model.Street;

import java.util.List;

public interface StreetService {
    void saveStreet(Street street);
    List<Street>getAllStreets();
}
