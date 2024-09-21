package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class DLC {

  @Id @GeneratedValue private Long id;

  @ManyToOne @JoinColumn private Game game;

  @Column(nullable = false)
  private String name;

  @OneToMany(mappedBy = "dlc")
  private Set<Release> release;
}
