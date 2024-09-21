package com.github.aloutta.ghq.persistence.service;

import com.github.aloutta.ghq.persistence.mapper.GenreMapper;
import com.github.aloutta.ghq.persistence.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreService {

  private static final GenreMapper GENRE_MAPPER = GenreMapper.INSTANCE;
  private final GenreRepository genreRepository;
}
