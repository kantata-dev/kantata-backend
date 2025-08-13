package kantata.gamification.repository;

import kantata.gamification.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Long> {
    //Optional<Demo> findById(Long id);
}
