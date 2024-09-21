package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Game {

  @Id @GeneratedValue private Long id;

  @Column(nullable = false, unique = true)
  private String title;

  @ManyToOne
  @JoinColumn
  private Developer developer;

  @OneToMany(mappedBy = "game")
  private Set<DLC> dlcs;

  @ManyToMany
  @JoinTable(
      joinColumns = @JoinColumn(name = "game_id"),
      inverseJoinColumns = @JoinColumn(name = "platform_id"))
  private Set<Platform> platforms;

  @ManyToMany
  @JoinTable(
      joinColumns = @JoinColumn(name = "game_id"),
      inverseJoinColumns = @JoinColumn(name = "genre_id"))
  private Set<Genre> genres;

  @ManyToMany
  @JoinTable(
      joinColumns = @JoinColumn(name = "game_id"),
      inverseJoinColumns = @JoinColumn(name = "tag_id"))
  private Set<Tag> tags;

  @OneToMany(mappedBy = "game")
  private Set<Screenshot> screenshots;

  @OneToMany(mappedBy = "game")
  private Set<Video> videos;

  @OneToMany(mappedBy = "game")
  private Set<Release> releases;
}
