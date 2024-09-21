package com.github.aloutta.ghq.persistence.repository;

import com.github.aloutta.ghq.persistence.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {}
