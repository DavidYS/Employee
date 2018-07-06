package repository;

import entity.Workplace;
import entity.Workplace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface WorkplaceRepository extends JpaRepository<Workplace, Long> {
    Collection<Workplace> findByCompanyName(String companyName);
}
