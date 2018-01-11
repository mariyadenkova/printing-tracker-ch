package eu.printingtrackerv2.repository;

import eu.printingtrackerv2.entities.Address;
import eu.printingtrackerv2.model.viewModels.addressViewModels.AddressViewModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface AddressRepository extends CrudRepository<Address, Long> {

    @Query(value = "SELECT a FROM Address AS a")
    Set<Address> findAllAddresses();

    @Modifying
    @Query(value = "SELECT a FROM Address AS a " +
            "WHERE a.id = :id")
    Set<Address> findAllByCustomerId(@Param("id") Long id);

}
