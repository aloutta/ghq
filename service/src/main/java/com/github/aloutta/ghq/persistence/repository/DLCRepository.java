package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.DLC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DLCRepository extends JpaRepository<DLC, Long> {}
