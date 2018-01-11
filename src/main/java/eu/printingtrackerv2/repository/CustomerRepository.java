package eu.printingtrackerv2.repository;

import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.entities.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query(value = "SELECT c FROM Customer AS c")
    Set<Customer> findAllCustomers();

    /*@Query(value = "SELECT n FROM Customer AS n WHERE n.id = :id")
    String findCustomersById(String name);*/

    Set<Customer> findAllByNameIn(String[] names);

    Customer findOneByName(String name);

}
