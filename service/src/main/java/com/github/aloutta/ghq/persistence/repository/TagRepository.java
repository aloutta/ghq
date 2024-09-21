package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {}
