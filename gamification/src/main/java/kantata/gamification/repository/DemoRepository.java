package kantata.gamification.repository;

import kantata.gamification.entity.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Long> {

}
