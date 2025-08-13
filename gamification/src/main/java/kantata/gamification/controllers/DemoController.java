package kantata.gamification.controllers;

import kantata.gamification.entity.Demo;
import kantata.gamification.repository.DemoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class DemoController {
    private final DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
        this.demoRepository.saveAll(List.of(
                new Demo("test", "test entity"),
                new Demo("test1", "test entity")
        ));
    }

    @GetMapping("/demo")
    Iterable<Demo> getDemo() {
        return demoRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Demo> getDemoById(@PathVariable Long id) {
        return demoRepository.findById(id);
    }

    @PostMapping
    Demo postDemo(@RequestBody Demo demo) {
        return demoRepository.save(demo);
    }

    @DeleteMapping("/{id}")
    void deleteDemo(@PathVariable Long id) {
        demoRepository.deleteById(id);
    }
}