package elma.streetsandpits.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Street street;

    public Pit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street_id) {
        this.street = street_id;
    }
}
