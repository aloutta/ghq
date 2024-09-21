package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Long> {}
