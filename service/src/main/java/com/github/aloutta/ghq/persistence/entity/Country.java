package com.github.aloutta.ghq.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Country {

  @Id @GeneratedValue private Long id;

  @Column(length = 2, nullable = false, unique = true)
  private String alpha2;

  @Column(length = 3, nullable = false, unique = true)
  private String alpha3;
}
