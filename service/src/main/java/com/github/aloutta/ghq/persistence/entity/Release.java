package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class Release {

  @Id @GeneratedValue private Long id;

  private LocalDate releaseDate;

  @ManyToOne @JoinColumn private Game game;

  @ManyToOne @JoinColumn private DLC dlc;

  @ManyToOne @JoinColumn private Country country;
}
