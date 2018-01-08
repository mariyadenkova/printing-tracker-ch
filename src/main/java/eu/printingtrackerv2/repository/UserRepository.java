package eu.printingtrackerv2.repository;

import eu.printingtrackerv2.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByUsername(String username);

}
