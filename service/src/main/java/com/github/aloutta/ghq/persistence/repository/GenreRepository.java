package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {}
