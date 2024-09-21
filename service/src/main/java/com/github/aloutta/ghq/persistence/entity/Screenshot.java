package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Screenshot {

  @Id @GeneratedValue private Long id;

  @ManyToOne @JoinColumn private Game game;

  @ManyToOne @JoinColumn private DLC dlc;

  @Column(nullable = false)
  private String url;
}
