package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Developer {

  @Id @GeneratedValue private Long id;

  @Column(nullable = false, unique = true)
  private String name;

  @OneToMany(mappedBy = "developer")
  private Set<Game> games;
}
