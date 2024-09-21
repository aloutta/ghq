package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.Screenshot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenshotRepository extends JpaRepository<Screenshot, Long> {}
