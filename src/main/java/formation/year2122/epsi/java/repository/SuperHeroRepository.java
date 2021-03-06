package formation.year2122.epsi.java.repository;

import formation.year2122.epsi.java.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SuperHeroRepository extends JpaRepository<SuperHero, Long> {
}
