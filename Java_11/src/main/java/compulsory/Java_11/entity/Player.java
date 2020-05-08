package compulsory.Java_11;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Player
 * retine numele si id-ul jucatorilor
 */

@Entity
public class Player {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    public Player(){}

    public Player(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
