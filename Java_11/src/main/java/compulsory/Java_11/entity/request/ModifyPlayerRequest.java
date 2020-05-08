package compulsory.Java_11.entity.request;

/**
 * @ModifyPlayerRequest se ocupa de modificarea numelui unui anumit jucator (e necesara pt metoda PUT din clasa
 * PlayerController)
 */

public class ModifyPlayerRequest {
    public String getName() {
        return name;
    }

    private String name;
}

