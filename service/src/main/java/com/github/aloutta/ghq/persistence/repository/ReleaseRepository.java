package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<Release, Long> {}
