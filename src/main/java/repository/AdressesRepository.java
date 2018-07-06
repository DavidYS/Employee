package repository;

import entity.Adresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AdressesRepository extends JpaRepository<Adresses, Long>{
    Collection<Adresses> findByTown(String town);
}
