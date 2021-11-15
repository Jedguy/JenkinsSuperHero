package formation.year2122.epsi.java.repository;

import formation.year2122.epsi.java.model.Power;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.DoubleStream;

public interface PowerRepository extends JpaRepository<Power, Long> {

    Power getByName(String name);

    List<Power> findAllByName(String name);

}
