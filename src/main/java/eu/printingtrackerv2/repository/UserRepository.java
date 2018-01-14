package eu.printingtrackerv2.repository;

import eu.printingtrackerv2.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByUsername(String username);

    @Query(value = "SELECT u FROM User AS u")
    Set<User> findAllUsers();

    Set<User> findAllByUsername(String[] usernames);

}
