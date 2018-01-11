package eu.printingtrackerv2.repository;

import eu.printingtrackerv2.entities.Package;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PackageRepository extends CrudRepository<Package, Long> {

    @Query(value = "SELECT p FROM Package AS p")
    Set<Package> findAllPackages();
}
