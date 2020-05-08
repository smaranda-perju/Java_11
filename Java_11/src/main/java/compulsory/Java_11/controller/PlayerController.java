package compulsory.Java_11.controller;

import compulsory.Java_11.Player;
import compulsory.Java_11.entity.request.AddPlayerRequest;
import compulsory.Java_11.entity.request.ModifyPlayerRequest;
import compulsory.Java_11.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ruta este http://localhost:8080/players
 *
 * @GET returneaza o lista cu toti jucatorii din repository-ul curent
 * @POST creaza un jucator nou: din request body va lua numele, id-ul va fi pus automat, apoi va salva in repository
 * noul jucator
 * clasa AddPlayerRequest retine numele noului jucator care va fi adaugat
 * @PUT primeste ca parametru in ruta un id ce reprezinta id-ul player-ului caruia vrem sa ii modificam numele
 * creaza un nou player ce ia din repository datele player-ului cu id-ul dat ca parametru
 * schimba numele player-ului creat cu numele dat in request body apoi salveaza modificarile
 * @DELETE primeste ca parametru un id, apoi sterge din repository linia cu id-ul respectiv
 */

@RestController
@RequestMapping("players")
public class PlayerController {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addPlayer(@RequestBody AddPlayerRequest addPlayerRequest) {
        Player player = new Player();
        player.setName(addPlayerRequest.getName());
        playerRepository.save(player);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPlayer(@PathVariable("id") long id, @RequestBody ModifyPlayerRequest modifyPlayerRequest) {
        Player player = playerRepository.getOne(id);
        player.setName(modifyPlayerRequest.getName());
        playerRepository.save(player);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable("id") long id) {
        playerRepository.deleteById(id);
    }

}

