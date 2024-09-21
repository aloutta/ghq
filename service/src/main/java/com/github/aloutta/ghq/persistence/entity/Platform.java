package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Platform {

  @Id @GeneratedValue private Long id;

  @Column(nullable = false, unique = true)
  private String name;

  @Column private String manufacturer;

  @ManyToMany(mappedBy = "platforms")
  private Set<Game> games;
}
