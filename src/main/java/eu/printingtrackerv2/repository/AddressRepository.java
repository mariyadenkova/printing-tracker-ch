package eu.printingtrackerv2.repository;

import eu.printingtrackerv2.entities.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface AddressRepository extends CrudRepository<Address, Long> {

    @Query(value = "SELECT a FROM Address AS a")
    Set<Address> findAllAddresses();

    /*@Query(value = "SELECT a FROM Address AS a " +
            "WHERE a.customer.id = :id")
    Set<Address> findAllByCustomerId(@Param("id") Long id);*/

}
