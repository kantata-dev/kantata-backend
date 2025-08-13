package kantata.gamification.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "demo")
@Data
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Demo(String name, String description) {
        this.name = name;
        this.description = description;
    }
}