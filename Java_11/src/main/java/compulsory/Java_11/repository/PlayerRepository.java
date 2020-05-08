package compulsory.Java_11.repository;

import compulsory.Java_11.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfata PlayerRepository e necesara pt a folosi JpaRepository
 */

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
