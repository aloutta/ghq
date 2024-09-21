package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Tag {

  @Id @GeneratedValue private Long id;

  @Column(nullable = false, unique = true)
  private String name;

  @ManyToMany(mappedBy = "tags")
  private Set<Game> games;
}
